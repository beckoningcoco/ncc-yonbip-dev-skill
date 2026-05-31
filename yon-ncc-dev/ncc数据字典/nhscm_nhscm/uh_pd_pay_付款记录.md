# |<<

**付款记录 (uh_pd_pay / com.yonyou.yh.nhis.scm.pdpay.vo.PdPayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6145.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpay | 主键 | pk_pdpay | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 付款编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | pk_sup | 供应商 | pk_sup | varchar(50) |  | 字符串 (String) |
| 6 | dt_paymode | 付款方式编码 | dt_paymode | varchar(50) |  | 字符串 (String) |
| 7 | pk_paymode | 付款方式 | pk_paymode | varchar(20) |  | 付款方式(自定义档案) (Defdoc-110100) |
| 8 | pk_bankdoc | 开户行 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 9 | bankno | 银行账号 | bankno | varchar(50) |  | 字符串 (String) |
| 10 | certno | 付款凭证号码 | certno | varchar(50) |  | 字符串 (String) |
| 11 | amount | 付款金额 | amount | varchar(50) |  | 字符串 (String) |
| 12 | date_pay | 付款日期 | date_pay | char(19) |  | 日期时间 (UFDateTime) |
| 13 | pk_psn_pay | 付款人 | pk_psn_pay | varchar(50) |  | 字符串 (String) |
| 14 | note | 备注 | note | varchar(50) |  | 字符串 (String) |