# |<<

**创建者权限明细 (sm_ctpermdetail / nc.vo.uap.rbac.CtPermDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5296.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctperm_detail | 主键 | pk_ctperm_detail | char(20) | √ | 字符串 (String) |
| 2 | pk_operation | 操作编码 | pk_operation | varchar(20) |  | 资源操作 (ResourceOperation) |
| 3 | configtype | 权限设置 | configtype | int | √ | 创建者权限设置选项 (enum) |  | 0=创建者有权; |