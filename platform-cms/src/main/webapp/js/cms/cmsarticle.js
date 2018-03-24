$(function () {
    $("#jqGrid").jqGrid({
        url: '../cmsarticle/list',
        datatype: "json",
        colModel: [
			{label: 'id', name: 'id', index: 'id', key: true, hidden: true},
			{label: '', name: 'title', index: 'title', width: 80},
			{label: '', name: 'banner', index: 'banner', width: 80},
			{label: '', name: 'categoryId', index: 'category_id', width: 80},
			{label: '', name: 'userId', index: 'user_id', width: 80},
			{label: '', name: 'createTime', index: 'create_time', width: 80},
			{label: '', name: 'updateTime', index: 'update_time', width: 80},
			{label: '', name: 'author', index: 'author', width: 80},
			{label: '', name: 'contend', index: 'contend', width: 80},
			{label: '', name: 'likenum', index: 'likenum', width: 80},
			{label: '', name: 'readnum', index: 'readnum', width: 80},
			{label: '原文链接', name: 'fromurl', index: 'fromurl', width: 80},
			{label: '类型 1 原创 2 转载', name: 'type', index: 'type', width: 80},
			{label: '', name: 'menuId', index: 'menu_id', width: 80},
			{label: '', name: 'categoryName', index: 'category_name', width: 80}],
		viewrecords: true,
        height: 385,
        rowNum: 10,
        rowList: [10, 30, 50],
        rownumbers: true,
        rownumWidth: 25,
        autowidth: true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader: {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames: {
            page: "page",
            rows: "limit",
            order: "order"
        },
        gridComplete: function () {
            $("#jqGrid").closest(".ui-jqgrid-bdiv").css({"overflow-x": "hidden"});
        }
    });
});

let vm = new Vue({
	el: '#rrapp',
	data: {
        showList: true,
        title: null,
		cmsArticle: {},
		ruleValidate: {
			name: [
				{required: true, message: '名称不能为空', trigger: 'blur'}
			]
		},
		q: {
		    name: ''
		}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function () {
			vm.showList = false;
			vm.title = "新增";
			vm.cmsArticle = {};
		},
		update: function (event) {
            let id = getSelectedRow();
			if (id == null) {
				return;
			}
			vm.showList = false;
            vm.title = "修改";

            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
            let url = vm.cmsArticle.id == null ? "../cmsarticle/save" : "../cmsarticle/update";
			$.ajax({
				type: "POST",
			    url: url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.cmsArticle),
                success: function (r) {
                    if (r.code === 0) {
                        alert('操作成功', function (index) {
                            vm.reload();
                        });
                    } else {
                        alert(r.msg);
                    }
                }
			});
		},
		del: function (event) {
            let ids = getSelectedRows();
			if (ids == null){
				return;
			}

			confirm('确定要删除选中的记录？', function () {
				$.ajax({
					type: "POST",
				    url: "../cmsarticle/delete",
				    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function (r) {
						if (r.code == 0) {
							alert('操作成功', function (index) {
								$("#jqGrid").trigger("reloadGrid");
							});
						} else {
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get("../cmsarticle/info/"+id, function (r) {
                vm.cmsArticle = r.cmsArticle;
            });
		},
		reload: function (event) {
			vm.showList = true;
            let page = $("#jqGrid").jqGrid('getGridParam', 'page');
			$("#jqGrid").jqGrid('setGridParam', {
                postData: {'name': vm.q.name},
                page: page
            }).trigger("reloadGrid");
            vm.handleReset('formValidate');
		},
        handleSubmit: function (name) {
            handleSubmitValidate(this, name, function () {
                vm.saveOrUpdate()
            });
        },
        handleReset: function (name) {
            handleResetForm(this, name);
        }
	}
});