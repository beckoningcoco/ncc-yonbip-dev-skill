# |<<

**组织关系_组织关系类型_数据校验 (org_relvalidator / nc.vo.org.orgmodel.OrgRelationValidatorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4149.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_validator | 组织关系类型数据校验主键 | pk_validator | char(20) | √ | 主键 (UFID) |
| 2 | pk_relationtype | 组织关系类型主键 | pk_relationtype | varchar(20) | √ | 组织关系_组织关系类型 (orgrelationtype) |
| 3 | pk_opertype | 操作类型 | pk_opertype | varchar(20) |  | 组织关系_操作 (operate) |
| 4 | validatorclass | 校验类路径 | validatorclass | varchar(100) | √ | 字符串 (String) |
| 5 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |