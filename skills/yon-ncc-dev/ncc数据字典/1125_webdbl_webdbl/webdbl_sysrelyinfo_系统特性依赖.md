# |<<

**系统特性依赖 (webdbl_sysrelyinfo / uap.lfw.dbl.vo.SysrelyinfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6378.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysrely | 主键 | pk_sysrely | char(20) | √ | 主键 (UFID) |
| 2 | pk_rely_sysattrtype | 依赖特性 | pk_rely_sysattrtype | varchar(20) |  | 协同公共对象特性分类 (wapdoc_sysattrtype) |
| 3 | orderid | 依赖顺序 | orderid | int |  | 整数 (Integer) |