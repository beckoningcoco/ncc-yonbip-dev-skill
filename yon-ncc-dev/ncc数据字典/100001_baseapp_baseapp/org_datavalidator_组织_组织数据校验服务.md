# |<<

**组织_组织数据校验服务 (org_datavalidator / nc.vo.org.orgmodel.OrgDataValidatorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgvalidate | 校验主键 | pk_orgvalidate | varchar(50) | √ | 字符串 (String) |
| 2 | pk_opertype | 操作类型 | pk_opertype | varchar(20) |  | 组织关系_操作 (operate) |
| 3 | pk_orgtype | 组织类型 | pk_orgtype | varchar(20) | √ | 组织其它_组织类型 (orgtype) |
| 4 | validatorclass | 校验类路径 | validatorclass | varchar(100) | √ | 字符串 (String) |
| 5 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |