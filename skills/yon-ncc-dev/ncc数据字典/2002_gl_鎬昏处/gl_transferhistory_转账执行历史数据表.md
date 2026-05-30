# |<<

**转账执行历史数据表 (gl_transferhistory / nc.vo.gl.transferHistory.transferhistory)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2489.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transferhistory | 主键 | pk_transferhistory | char(20) | √ | 主键 (UFID) |
| 2 | pk_voucher | 凭证主键 | pk_voucher | char(20) |  | 主键 (UFID) |
| 3 | transfertype | 转账类型 | transfertype | varchar(20) |  | 字符串 (String) |
| 4 | pk_transfer | 转账主键 | pk_transfer | char(20) |  | 主键 (UFID) |
| 5 | operatetime | 操作时间 | operatetime | char(10) |  | 主键 (UFID) |
| 6 | pk_sob | 帐簿主键 | pk_sob | char(20) |  | 主键 (UFID) |
| 7 | pk_corp | 公司主键 | pk_corp | char(4) |  | 主键 (UFID) |
| 8 | year | 会计年度 | year | char(4) |  | 主键 (UFID) |
| 9 | period | 会计期间 | period | char(2) |  | 主键 (UFID) |
| 10 | pk_glbook | 帐簿 | pk_glbook | char(20) |  | 主键 (UFID) |
| 11 | pk_glorg | 主体 | pk_glorg | char(20) |  | 主键 (UFID) |
| 12 | pk_accountingbook | 主体帐簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 13 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 14 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 15 | pk_unit | 业务单元 | pk_unit | char(20) |  | 主键 (UFID) |
| 16 | free1 | 预留字段1 | free1 | varchar(60) |  | 字符串 (String) |
| 17 | free2 | 预留字段2 | free2 | varchar(60) |  | 字符串 (String) |
| 18 | free3 | 预留字段3 | free3 | varchar(60) |  | 字符串 (String) |
| 19 | free4 | 预留字段4 | free4 | varchar(60) |  | 字符串 (String) |
| 20 | free5 | 预留字段5 | free5 | varchar(60) |  | 字符串 (String) |