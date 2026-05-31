# |<<

**科目控制规则关联科目 (bd_accctrlasoa / nc.vo.bd.accctrlrule.AccCtrlAsoaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/300.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accctrlasoa | 主键 | pk_accctrlasoa | char(20) | √ | 主键 (UFID) |
| 2 | pk_account | 科目主键 | pk_account | char(20) | √ | 会计科目基本信息 (account) |
| 3 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |