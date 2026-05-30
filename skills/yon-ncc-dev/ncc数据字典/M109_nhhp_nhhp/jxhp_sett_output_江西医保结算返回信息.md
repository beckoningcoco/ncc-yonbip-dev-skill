# |<<

**江西医保结算返回信息 (jxhp_sett_output / nc.vo.nhhp.hp.jx.city.vo.JxHpSettOutputVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3538.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sett_output | 主键 | pk_sett_output | char(20) | √ | 主键 (UFID) |
| 2 | output_1 | 社会保险号 | output_1 | varchar(20) |  | 字符串 (String) |
| 3 | output_2 | 社会保障卡号 | output_2 | varchar(20) |  | 字符串 (String) |
| 4 | output_3 | 姓名 | output_3 | varchar(20) |  | 字符串 (String) |
| 5 | output_4 | 性别 | output_4 | varchar(10) |  | 字符串 (String) |
| 6 | output_5 | 出生日期 | output_5 | varchar(8) |  | 字符串 (String) |
| 7 | output_6 | 地区编号 | output_6 | varchar(6) |  | 字符串 (String) |
| 8 | output_7 | 地区名称 | output_7 | varchar(20) |  | 字符串 (String) |
| 9 | output_8 | 参保日期 | output_8 | varchar(8) |  | 字符串 (String) |
| 10 | output_9 | 参保身份 | output_9 | varchar(50) |  | 字符串 (String) |
| 11 | output_10 | 行政职务级别 | output_10 | varchar(50) |  | 字符串 (String) |
| 12 | output_11 | 医疗待遇享受类别 | output_11 | varchar(50) |  | 字符串 (String) |
| 13 | output_12 | 单位名称 | output_12 | varchar(100) |  | 字符串 (String) |
| 14 | output_13 | 单位类型 | output_13 | varchar(20) |  | 字符串 (String) |
| 15 | output_14 | 中心业务流水号 | output_14 | varchar(20) |  | 字符串 (String) |
| 16 | output_15 | 中心结算单据号 | output_15 | varchar(20) |  | 字符串 (String) |
| 17 | output_16 | 医疗类别 | output_16 | varchar(50) |  | 字符串 (String) |
| 18 | output_17 | 结算费用起始日期 | output_17 | varchar(8) |  | 字符串 (String) |
| 19 | output_18 | 结算费用截止日期 | output_18 | varchar(8) |  | 字符串 (String) |
| 20 | output_19 | 医疗总费用 | output_19 | decimal(16, 2) |  | 数值 (UFDouble) |
| 21 | output_20 | 本次账户支付 | output_20 | decimal(16, 2) |  | 数值 (UFDouble) |
| 22 | output_21 | 本次现金支付 | output_21 | decimal(16, 2) |  | 数值 (UFDouble) |
| 23 | output_22 | 职工基本医疗基金支付 | output_22 | decimal(16, 2) |  | 数值 (UFDouble) |
| 24 | output_23 | 城镇居民基本医疗基金支付 | output_23 | decimal(16, 2) |  | 数值 (UFDouble) |
| 25 | output_24 | 城乡居民基本医疗基金支付 | output_24 | decimal(16, 2) |  | 数值 (UFDouble) |
| 26 | output_25 | 大病医疗基金支付 | output_25 | decimal(16, 2) |  | 数值 (UFDouble) |
| 27 | output_26 | 公务员补充医疗基金支付 | output_26 | decimal(16, 2) |  | 数值 (UFDouble) |
| 28 | output_27 | 企业补充医疗基金支付 | output_27 | decimal(16, 2) |  | 数值 (UFDouble) |
| 29 | output_28 | 二乙专项医疗基金支付 | output_28 | decimal(16, 2) |  | 数值 (UFDouble) |
| 30 | output_29 | 老红军专项医疗基金支付 | output_29 | decimal(16, 2) |  | 数值 (UFDouble) |
| 31 | output_30 | 离休干部单独统筹基金支付 | output_30 | decimal(16, 2) |  | 数值 (UFDouble) |
| 32 | output_31 | 医疗保健支付 | output_31 | decimal(16, 2) |  | 数值 (UFDouble) |
| 33 | output_32 | 其他基金支付 | output_32 | decimal(16, 2) |  | 数值 (UFDouble) |
| 34 | output_33 | 工伤基金支付 | output_33 | decimal(16, 2) |  | 数值 (UFDouble) |
| 35 | output_34 | 生育基金支付 | output_34 | decimal(16, 2) |  | 数值 (UFDouble) |
| 36 | output_35 | 民政救助支付 | output_35 | decimal(16, 2) |  | 数值 (UFDouble) |
| 37 | output_36 | 单位负担支付 | output_36 | decimal(16, 2) |  | 数值 (UFDouble) |
| 38 | output_37 | 定点机构支付 | output_37 | decimal(16, 2) |  | 数值 (UFDouble) |
| 39 | output_38 | 医保账户余额 | output_38 | decimal(16, 2) |  | 数值 (UFDouble) |
| 40 | output_39 | 甲类费用 | output_39 | decimal(16, 2) |  | 数值 (UFDouble) |
| 41 | output_40 | 乙类费用 | output_40 | decimal(16, 2) |  | 数值 (UFDouble) |
| 42 | output_41 | 丙类费用 | output_41 | decimal(16, 2) |  | 数值 (UFDouble) |
| 43 | output_42 | 自费费用 | output_42 | decimal(16, 2) |  | 数值 (UFDouble) |
| 44 | output_43 | 先行自付 | output_43 | decimal(16, 2) |  | 数值 (UFDouble) |
| 45 | output_44 | 起付段自付 | output_44 | decimal(16, 2) |  | 数值 (UFDouble) |
| 46 | output_45 | 转外自付 | output_45 | decimal(16, 2) |  | 数值 (UFDouble) |
| 47 | output_46 | 统筹段自付 | output_46 | decimal(16, 2) |  | 数值 (UFDouble) |
| 48 | output_47 | 大病统筹自付 | output_47 | decimal(16, 2) |  | 数值 (UFDouble) |
| 49 | output_48 | 公务员补充医疗自付 | output_48 | decimal(16, 2) |  | 数值 (UFDouble) |
| 50 | output_49 | 超高最高封顶线自付 | output_49 | decimal(16, 2) |  | 数值 (UFDouble) |
| 51 | output_50 | 转诊单位负担 | output_50 | decimal(16, 2) |  | 数值 (UFDouble) |
| 52 | output_51 | 统筹段单位负担 | output_51 | decimal(16, 2) |  | 数值 (UFDouble) |
| 53 | output_52 | 大病段单位负担 | output_52 | decimal(16, 2) |  | 数值 (UFDouble) |
| 54 | output_53 | 统筹段基金支付 | output_53 | decimal(16, 2) |  | 数值 (UFDouble) |
| 55 | output_54 | 大病段基金支付 | output_54 | decimal(16, 2) |  | 数值 (UFDouble) |
| 56 | output_55 | 个人账户抵扣现金支付标志 | output_55 | varchar(3) |  | 字符串 (String) |
| 57 | output_56 | 公务员补助基本医疗支付 | output_56 | decimal(16, 2) |  | 数值 (UFDouble) |
| 58 | output_57 | 公务员补助大病医疗支付 | output_57 | decimal(16, 2) |  | 数值 (UFDouble) |
| 59 | output_58 | 结算人 | output_58 | varchar(20) |  | 字符串 (String) |
| 60 | output_59 | 结算日期 | output_59 | varchar(8) |  | 字符串 (String) |
| 61 | output_60 | 结算时间 | output_60 | varchar(8) |  | 字符串 (String) |
| 62 | pvtype | 就诊类型 | pvtype | varchar(8) |  | 字符串 (String) |
| 63 | revoke_flag | 撤回标志 | revoke_flag | varchar(3) |  | 字符串 (String) |
| 64 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 65 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 66 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 67 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 68 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 69 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 70 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |