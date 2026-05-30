# |<<

**服务申请单 (bd_uh_srv_pf / com.yonyou.yh.nhis.bd.uhsrvpf.vo.UHSrvPfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1120.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srv_pf | 服务申请单主键 | pk_srv_pf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 申请集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 申请组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 5 | targetorg | 目的组织 | targetorg | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 6 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 7 | proposer | 申请人 | proposer | varchar(20) |  | 用户 (user) |
| 8 | proposetime | 申请时间 | proposetime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |