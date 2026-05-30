# |<<

**门急诊结算消费日志 (uh_bl_paylog / nc.vo.nhbl.blpaylog.BLPayLogVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bllog | pk_bllog | pk_bllog | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 3 | pk_dept | pk_dept | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 4 | pk_st | 对应结算主键 | pk_st | varchar(20) |  | 结算 (BLSettleVO) |
| 5 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 6 | pk_pv | 就诊主键 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 7 | pk_psn | 操作人员 | pk_psn | varchar(20) |  | 用户 (user) |
| 8 | name_psn | 操作人名称 | name_psn | varchar(500) |  | 字符串 (String) |
| 9 | date_pay | 消费日期 | date_pay | char(19) |  | 日期时间 (UFDateTime) |
| 10 | dt_paymode | 支付方式 | dt_paymode | varchar(50) |  | 字符串 (String) |
| 11 | pk_paymode | 支付方式主键 | pk_paymode | varchar(20) |  | 字符串 (String) |
| 12 | eu_direct | 收退方向 | eu_direct | int |  | 整数 (Integer) |
| 13 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | inputstr | 输入参数 | inputstr | varchar(500) |  | 字符串 (String) |
| 15 | outstr | 返回值 | outstr | varchar(500) |  | 字符串 (String) |