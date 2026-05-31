# |<<

**科目对照 (bd_accountmap / nc.vo.bd.accountmap.AccountMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/313.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accmap | 科目对照主键 | pk_accmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_newaccount | 新版本科目主键 | pk_newaccount | varchar(20) |  | 会计科目 (accasoa) |
| 3 | pk_oldaccount | 旧版本科目主键 | pk_oldaccount | varchar(20) |  | 会计科目 (accasoa) |
| 4 | pk_accchart | 所属科目表 | pk_accchart | varchar(20) |  | 科目表 (accchart) |
| 5 | pk_oldchart | 科目表旧版本 | pk_oldchart | varchar(20) |  | 科目表 (accchart) |
| 6 | pk_oldaccounthis | 旧版本科目历史表主键 | pk_oldaccounthis | varchar(40) |  | 科目关联信息历史 (accasoahistory) |
| 7 | mapstatus | 对照状态 | mapstatus | int |  | 对照状态 (mapstatus) | 1 | 0=已对照; |