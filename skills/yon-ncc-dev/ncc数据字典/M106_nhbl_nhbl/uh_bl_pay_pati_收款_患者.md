# |<<

**收款_患者 (uh_bl_pay_pati / com.yonyou.yh.nhis.bl.pay.vo.BLPatiPayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5942.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paypati | 收款患者主键 | pk_paypati | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_paytype | 收款类型 | pk_paytype | varchar(20) |  | 收款类型(自定义档案) (Defdoc-110002) |
| 5 | dt_paytype | 收款类型编码 | dt_paytype | varchar(30) |  | 字符串 (String) |
| 6 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 7 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 8 | pk_pati | 患者编码 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 9 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 10 | eu_direct | 收退方向 | eu_direct | int |  | 交退款方向 (PayDirectEnum) |  | 1=交款; |