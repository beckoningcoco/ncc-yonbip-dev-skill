# |<<

**住院记费 (uh_bl_cg_ip / com.yonyou.yh.nhis.bl.cg.vo.BLCgIpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5925.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cg | 记费主键 | pk_cg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 字符串 (String) |
| 6 | pk_pv | 就诊 | pk_pv | varchar(50) |  | 字符串 (String) |
| 7 | eu_direct | 记退费方向 | eu_direct | int |  | 整数 (Integer) |
| 8 | flag_pd | 物品标志 | flag_pd | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_srvcate | 基础费用分类 | pk_srvcate | varchar(20) |  | 字符串 (String) |
| 10 | pk_item | 服务收费项目 | pk_item | varchar(20) |  | 字符串 (String) |
| 11 | name_cg | 记费名称 | name_cg | varchar(256) |  | 字符串 (String) |
| 12 | pk_measdoc | 项目单位/物品当前单位 | pk_measdoc | varchar(20) |  | 字符串 (String) |
| 13 | pk_disc | 优惠类型 | pk_disc | varchar(20) |  | 字符串 (String) |
| 14 | ratio_disc | 折扣比例 | ratio_disc | decimal(28, 2) |  | 数值 (UFDouble) |
| 15 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | quan_med | 数量 | quan_med | decimal(28, 2) |  | 数值 (UFDouble) |
| 17 | amount | 金额 | amount | decimal(28, 2) |  | 数值 (UFDouble) |
| 18 | ratio_pati | 自费比例 | ratio_pati | decimal(28, 2) |  | 数值 (UFDouble) |
| 19 | amount_pati | 金额_患者自费 | amount_pati | decimal(28, 2) |  | 数值 (UFDouble) |
| 20 | pk_dept_ord | 开立科室 | pk_dept_ord | varchar(20) |  | 字符串 (String) |
| 21 | pk_wg_phy | 开立医疗组 | pk_wg_phy | varchar(20) |  | 字符串 (String) |
| 22 | pk_psn_phy | 开立医生 | pk_psn_phy | varchar(20) |  | 字符串 (String) |
| 23 | name_psn_phy | 开立医生名称 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 24 | pk_dept_ns | 开立病区 | pk_dept_ns | varchar(20) |  | 字符串 (String) |
| 25 | pk_org_exec | 执行机构 | pk_org_exec | varchar(20) |  | 字符串 (String) |
| 26 | pk_dept_exec | 执行科室 | pk_dept_exec | varchar(20) |  | 字符串 (String) |
| 27 | pk_ord | 关联医嘱 | pk_ord | varchar(30) |  | 字符串 (String) |
| 28 | date_srv | 服务发生日期 | date_srv | char(19) |  | 日期时间 (UFDateTime) |
| 29 | pk_pd | 物品 | pk_pd | varchar(20) |  | 字符串 (String) |
| 30 | batch_pd | 物品批次 | batch_pd | varchar(30) |  | 字符串 (String) |
| 31 | pk_measdoc_base | 物品包装单位_基本包装单位 | pk_measdoc_base | varchar(20) |  | 字符串 (String) |
| 32 | factor_cb | 换算系数公式_当前单位/基本单位 | factor_cb | varchar(256) |  | 字符串 (String) |
| 33 | price_cost_sales | 进价_当前包装单位 | price_cost_sales | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | flag_acc | 患者账户支付标志 | flag_acc | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | amt_acc_pre | 账户金额_预交金 | amt_acc_pre | decimal(28, 2) |  | 数值 (UFDouble) |
| 36 | amt_acc_cred | 账户金额_信用 | amt_acc_cred | decimal(28, 2) |  | 数值 (UFDouble) |
| 37 | flag_st | 结算标志 | flag_st | char(1) |  | 布尔类型 (UFBoolean) |
| 38 | date_st | 结算日期 | date_st | char(19) |  | 日期时间 (UFDateTime) |
| 39 | pk_st | 关联结算 | pk_st | varchar(20) |  | 字符串 (String) |
| 40 | newborn | 婴儿序号 | newborn | int |  | 整数 (Integer) |
| 41 | pk_pres | 处方 | pk_pres | varchar(20) |  | 字符串 (String) |
| 42 | pk_ordpddt | 对应执行医嘱物品 | pk_ordpddt | varchar(20) |  | 字符串 (String) |
| 43 | flag_hp | 医保上传标志 | flag_hp | char(1) |  | 布尔类型 (UFBoolean) |
| 44 | flag_susp | 记费挂账标志 | flag_susp | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | pk_cg_ret | 退费关联记费主键 | pk_cg_ret | varchar(20) |  | 字符串 (String) |
| 46 | date_cg | 记费日期 | date_cg | char(19) |  | 日期时间 (UFDateTime) |
| 47 | pk_org_cg | 记费机构 | pk_org_cg | varchar(20) |  | 字符串 (String) |
| 48 | pk_dept_cg | 记费部门 | pk_dept_cg | varchar(20) |  | 字符串 (String) |
| 49 | pk_psn_cg | 记费人员 | pk_psn_cg | varchar(20) |  | 字符串 (String) |
| 50 | name_psn_cg | 记费人员名称 | name_psn_cg | varchar(50) |  | 字符串 (String) |
| 51 | pk_exlist | 执行单主键 | pk_exlist | char(20) |  | 字符串 (String) |
| 52 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 72 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 73 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 74 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 75 | modifier | 最后修改人 | modifier | varchar(50) |  | 字符串 (String) |