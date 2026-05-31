# |<<

**患者收付款 (uh_bl_pay_pi / com.yonyou.yh.nhis.bl.pay.vo.BLPayPiVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paypati | 收款患者主键 | pk_paypati | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者编码 | pk_pati | char(20) |  | 患者基本信息 (pati) |
| 5 | amt_before | 收退前金额 | amt_before | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | eu_direct | 收退方向 | eu_direct | varchar(0) |  | 交退款方向 (PayDirectEnum) |  | 1=交款; |