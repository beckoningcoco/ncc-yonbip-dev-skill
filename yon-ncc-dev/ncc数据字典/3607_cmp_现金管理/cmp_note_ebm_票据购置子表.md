# |<<

**票据购置子表 (cmp_note_ebm / nc.vo.cmp.note.gz.NoteGzBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1563.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebm | 管理表OID | pk_ebm | char(20) | √ | 主键 (UFID) |
| 2 | pk_ebm | 管理表OID | pk_ebm | char(20) | √ | 主键 (UFID) |
| 3 | pk_org | 财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 5 | pk_bill_gz | 购置表 | pk_bill_gz | varchar(20) |  | 票据购置 (notegz) |
| 6 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 7 | pk_notetype | 票据类型 | pk_notetype | varchar(20) |  | 票据类型 (notetype) |
| 8 | bankcode | 银行账户 | bankcode | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | bill_number | 票据号 | bill_number | varchar(20) |  | 字符串 (String) |
| 10 | bill_status | 票据状态 | bill_status | varchar(50) |  | 票据状态 (enum) |  | 0=已购置未领用; |