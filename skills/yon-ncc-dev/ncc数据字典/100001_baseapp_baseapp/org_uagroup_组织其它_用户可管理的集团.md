# |<<

**组织其它_用户可管理的集团 (org_uagroup / nc.vo.org.UserAdminGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4183.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_uagroup | 管理主键 | pk_uagroup | char(20) | √ | 主键 (UFID) |
| 2 | cuserid | 用户主键 | cuserid | varchar(20) | √ | 用户 (user) |
| 3 | pk_group | 集团主键 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | enabledate | 管理生效日期 | enabledate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 5 | disabledate | 管理失效日期 | disabledate | char(10) |  | 模糊日期 (UFLiteralDate) |