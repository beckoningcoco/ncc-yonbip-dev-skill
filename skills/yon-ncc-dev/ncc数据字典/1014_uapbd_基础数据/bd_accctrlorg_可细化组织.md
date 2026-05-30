# |<<

**可细化组织 (bd_accctrlorg / nc.vo.bd.accctrlrule.AccCtrlOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/301.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accctrlorg | 主键 | pk_accctrlorg | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | char(20) | √ | 组织 (org) |
| 3 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |