# |<<

**包含业务单元版本 (org_pforg_v / nc.vo.profitcenter.PforgVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_businessunit | 业务单元 | pk_businessunit | varchar(20) |  | 组织 (org) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(50) |  | 字符串 (String) |