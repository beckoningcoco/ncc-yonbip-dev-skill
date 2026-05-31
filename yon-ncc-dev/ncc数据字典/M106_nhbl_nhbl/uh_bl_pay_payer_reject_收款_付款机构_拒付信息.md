# |<<

**收款_付款机构_拒付信息 (uh_bl_pay_payer_reject / com.yonyou.yh.nhis.bl.pay.vo.BLPayerUnpayInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5944.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payreject | 医保拒付主键 | pk_payreject | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者编码 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 6 | pk_pv | 就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 7 | pk_srv | 拒付服务 | pk_srv | char(20) |  | 主键 (UFID) |
| 8 | pk_dept | 科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn | 医生 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | amount | 拒付金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | pk_rejectresion | 原因编码 | pk_rejectresion | varchar(20) |  | 字符串 (String) |
| 12 | dt_rejectresion | 原因编码dt | dt_rejectresion | char(20) |  | 字符串 (String) |
| 13 | resion | 原因 | resion | varchar(256) |  | 字符串 (String) |
| 14 | eu_status | 状态 | eu_status | int |  | 医保拒付状态 (PayerRejectEnum) |  | 1=拒付下发; |