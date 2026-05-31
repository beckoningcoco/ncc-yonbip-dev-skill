# |<<

**常用责任凭证 (nresa_commondutyvoucher / nc.vo.nresa.commondutyvoucher.CommonDutyVoucherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commonvoucher | 常用责任凭证主键 | pk_commonvoucher | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 4 | scope | 使用范围 | scope | varchar(50) |  | 使用范围 (CommonVoucherScope) |  | 0=公用; |