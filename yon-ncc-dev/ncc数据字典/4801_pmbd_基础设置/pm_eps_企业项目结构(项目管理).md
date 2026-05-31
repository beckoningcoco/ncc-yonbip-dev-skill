# |<<

**企业项目结构(项目管理) (pm_eps / nc.vo.pmbd.eps.EpsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eps | 项目结构主键 | pk_eps | char(20) | √ | 主键 (UFID) |
| 2 | eps_code | EPS编码 | eps_code | varchar(40) |  | 字符串 (String) |
| 3 | eps_name | EPS名称 | eps_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 4 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |