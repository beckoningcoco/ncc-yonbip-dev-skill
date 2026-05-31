# |<<

**业务人员来源子表 (org_busi_func / nc.vo.relation.BusiFuncVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4021.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busicode | 业务人员来源子表主键 | pk_busicode | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | org_function | 业务场景 | org_function | varchar(50) |  | 字符串 (String) |