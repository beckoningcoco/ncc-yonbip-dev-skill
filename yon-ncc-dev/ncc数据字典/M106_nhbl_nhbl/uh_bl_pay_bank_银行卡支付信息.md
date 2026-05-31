# |<<

**银行卡支付信息 (uh_bl_pay_bank / com.yonyou.yh.nhis.bl.pay.vo.BankCardVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5941.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bank | 银行卡交易主键 | pk_bank | char(20) | √ | 主键 (UFID) |
| 2 | pk_patipay | 收款主键 | pk_patipay | varchar(20) |  | 字符串 (String) |
| 3 | bankid | 银行行号 | bankid | varchar(50) |  | 字符串 (String) |
| 4 | bankcard | 银行卡号 | bankcard | varchar(50) |  | 字符串 (String) |
| 5 | document_no | 凭证号 | document_no | varchar(50) |  | 字符串 (String) |
| 6 | amount | 金额 | amount | varchar(50) |  | 字符串 (String) |
| 7 | shop_no | 商户号 | shop_no | varchar(50) |  | 字符串 (String) |
| 8 | terminal_no | 终端号 | terminal_no | varchar(50) |  | 字符串 (String) |
| 9 | batch_no | 批次号 | batch_no | varchar(50) |  | 字符串 (String) |
| 10 | deal_date | 交易日期 | deal_date | varchar(50) |  | 字符串 (String) |
| 11 | deal_time | 交易时间 | deal_time | varchar(50) |  | 字符串 (String) |
| 12 | deal_refer_no | 交易参考号 | deal_refer_no | varchar(50) |  | 字符串 (String) |
| 13 | grant_no | 授权号 | grant_no | varchar(50) |  | 字符串 (String) |
| 14 | clear_date | 清算时间 | clear_date | varchar(50) |  | 字符串 (String) |
| 15 | lrc_no | LRC校验 | lrc_no | varchar(50) |  | 字符串 (String) |
| 16 | eu_driect | 记退费方向 | eu_driect | int |  | 整数 (Integer) |
| 17 | bankinfo | 返回的所有信息 | bankinfo | varchar(255) |  | 字符串 (String) |
| 18 | flag_blcc | 是否结账 | flag_blcc | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | pk_blcc | 结账主键 | pk_blcc | varchar(50) |  | 字符串 (String) |
| 20 | flag_back | 是否是撤销 | flag_back | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | amoun_original | 原交易金额 | amoun_original | varchar(50) |  | 字符串 (String) |
| 22 | amoun_subsidy | 第三方补贴金额 | amoun_subsidy | varchar(50) |  | 字符串 (String) |
| 23 | amoun_none | 商户让利金额 | amoun_none | varchar(50) |  | 字符串 (String) |
| 24 | amoun_deductible | 积分抵扣金额 | amoun_deductible | varchar(50) |  | 字符串 (String) |
| 25 | pk_paypati | 门诊主键 | pk_paypati | varchar(20) |  | 字符串 (String) |
| 26 | trans_type | 交易类型 | trans_type | int |  | 整数 (Integer) |
| 27 | def1 | 备用字段 | def1 | varchar(100) |  | 字符串 (String) |