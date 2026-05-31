# |<<

**科目控制规则 (bd_accctrlrule / nc.vo.bd.accctrlrule.AccCtrlRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/302.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accctrlrule | 主键 | pk_accctrlrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_accchart | 所属科目表 | pk_accchart | char(20) | √ | 科目表 (accchart) |
| 3 | pk_accsystem | 所属科目体系 | pk_accsystem | char(20) | √ | 科目体系 (accsystem) |
| 4 | code | 控制规则编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 控制规则名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |