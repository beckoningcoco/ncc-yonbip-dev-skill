# |<<

**临床_门诊_医嘱 (uh_cn_oupt_ord / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6033.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ord | 医疗医嘱主键 | pk_ord | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_pvtype | 就诊类型主键 | pk_pvtype | varchar(50) |  | 字符串 (String) |
| 5 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_pv | 就诊编码 | pk_pv | varchar(20) |  | 字符串 (String) |
| 7 | pk_pati | 就诊主键 | pk_pati | varchar(20) |  | 字符串 (String) |
| 8 | date_valid | 医嘱有效日期 | date_valid | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_srvtype | 服务类型主键 | pk_srvtype | varchar(50) |  | 字符串 (String) |
| 10 | code_srvtype | 医嘱类型编码 | code_srvtype | varchar(50) |  | 字符串 (String) |
| 11 | eu_recur | 医嘱重复类型 | eu_recur | int |  | 整数 (Integer) |
| 12 | sortno | 医嘱序号 | sortno | int |  | 整数 (Integer) |
| 13 | sortno_parent | 上级医嘱序号 | sortno_parent | int |  | 整数 (Integer) |
| 14 | pk_srv | 服务 | pk_srv | char(20) |  | 主键 (UFID) |
| 15 | pk_pres | 处方 | pk_pres | char(20) |  | 主键 (UFID) |
| 16 | code_ord | 医嘱编码 | code_ord | varchar(30) |  | 字符串 (String) |
| 17 | name_ord | 医嘱名称 | name_ord | varchar(256) |  | 字符串 (String) |
| 18 | desc_ord | 医嘱描述 | desc_ord | varchar(512) |  | 字符串 (String) |
| 19 | code_apply | 申请单号码 | code_apply | varchar(30) |  | 字符串 (String) |
| 20 | pk_freq | 医嘱频次 | pk_freq | varchar(20) |  | 字符串 (String) |
| 21 | quan_med | 剂量 | quan_med | decimal(14, 2) |  | 数值 (UFDouble) |
| 22 | pk_measdoc_med | 剂量单位 | pk_measdoc_med | varchar(20) |  | 字符串 (String) |
| 23 | quan | 用量 | quan | decimal(14, 2) |  | 数值 (UFDouble) |
| 24 | pk_measdoc | 用量单位 | pk_measdoc | varchar(20) |  | 字符串 (String) |
| 25 | pk_usage | 医嘱用法 | pk_usage | varchar(20) |  | 字符串 (String) |
| 26 | dt_usagenote | 用法要求编码 | dt_usagenote | varchar(50) |  | 字符串 (String) |
| 27 | pk_usagenote | 用法要求主键 | pk_usagenote | varchar(50) |  | 字符串 (String) |
| 28 | usagenote | 用法要求 | usagenote | varchar(50) |  | 字符串 (String) |
| 29 | drip_speed | 滴速 | drip_speed | int |  | 整数 (Integer) |
| 30 | days_ord | 医嘱天数 | days_ord | int |  | 整数 (Integer) |
| 31 | ords | 医嘱付数 | ords | int |  | 整数 (Integer) |
| 32 | flag_first | 首次标志 | flag_first | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | num_last | 末次数量 | num_last | decimal(14, 2) |  | 数值 (UFDouble) |
| 34 | pk_org_exec | 执行机构 | pk_org_exec | varchar(20) |  | 字符串 (String) |
| 35 | pk_dept_exec | 执行科室 | pk_dept_exec | varchar(20) |  | 字符串 (String) |
| 36 | eu_status_ord | 医嘱状态 | eu_status_ord | int |  | 整数 (Integer) |
| 37 | date_entry | 医嘱开立日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 38 | date_begin | 医嘱开始日期 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 39 | flag_self | 自备标志 | flag_self | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | flag_note | 嘱托标志 | flag_note | char(1) |  | 布尔类型 (UFBoolean) |
| 41 | flag_bl | 记费医嘱标志 | flag_bl | char(1) |  | 布尔类型 (UFBoolean) |
| 42 | flag_pd | 药品标志 | flag_pd | char(1) |  | 布尔类型 (UFBoolean) |
| 43 | pk_dept_phy | 开立科室 | pk_dept_phy | varchar(20) |  | 字符串 (String) |
| 44 | pk_dept_ns | 开立病区 | pk_dept_ns | varchar(20) |  | 字符串 (String) |
| 45 | pk_wg_phy | 医生医疗组 | pk_wg_phy | varchar(20) |  | 字符串 (String) |
| 46 | pk_psn_input | 录入人 | pk_psn_input | varchar(20) |  | 字符串 (String) |
| 47 | name_psn_input | 录入人名称 | name_psn_input | varchar(300) |  | 字符串 (String) |
| 48 | pk_psn_phy | 开立医生 | pk_psn_phy | varchar(20) |  | 字符串 (String) |
| 49 | name_psn_phy | 开立医生名称 | name_psn_phy | varchar(300) |  | 字符串 (String) |
| 50 | flag_sign | 签署标志 | flag_sign | char(1) |  | 布尔类型 (UFBoolean) |
| 51 | date_sign | 签署日期时间 | date_sign | char(19) |  | 日期时间 (UFDateTime) |
| 52 | flag_chk | 核对标志 | flag_chk | char(1) |  | 布尔类型 (UFBoolean) |
| 53 | pk_psn_chk | 核对护士 | pk_psn_chk | varchar(20) |  | 字符串 (String) |
| 54 | name_psn_chk | 核对护士名称 | name_psn_chk | varchar(300) |  | 字符串 (String) |
| 55 | date_chk | 核对日期时间 | date_chk | char(19) |  | 日期时间 (UFDateTime) |
| 56 | flag_exec | 执行标志 | flag_exec | char(1) |  | 布尔类型 (UFBoolean) |
| 57 | date_exec | 最近执行日期时间 | date_exec | char(19) |  | 日期 (UFDate) |
| 58 | date_exec_plan | 计划执行时间 | date_exec_plan | char(19) |  | 日期时间 (UFDateTime) |
| 59 | flag_stop_phy | 医嘱停止下达标志 | flag_stop_phy | char(1) |  | 布尔类型 (UFBoolean) |
| 60 | date_end | 停止日期 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 61 | pk_psn_stop_phy | 医嘱停止下达医生 | pk_psn_stop_phy | varchar(20) |  | 字符串 (String) |
| 62 | name_psn_stop_phy | name_psn_stop_phy | name_psn_stop_phy | varchar(300) |  | 字符串 (String) |
| 63 | flag_stop_chk | 停止核对标志 | flag_stop_chk | char(1) |  | 布尔类型 (UFBoolean) |
| 64 | pk_psn_stop_chk | 停止核对护士 | pk_psn_stop_chk | varchar(20) |  | 字符串 (String) |
| 65 | name_psn_stop_chk | 停止核对护士名称 | name_psn_stop_chk | varchar(300) |  | 字符串 (String) |
| 66 | flag_canc | 作废标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 67 | date_canc | 作废日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 68 | pk_psn_canc | 作废医生 | pk_psn_canc | varchar(20) |  | 字符串 (String) |
| 69 | name_psn_canc | 作废医生名称 | name_psn_canc | varchar(300) |  | 字符串 (String) |
| 70 | flag_cp | 临床路径控制标志 | flag_cp | char(1) |  | 布尔类型 (UFBoolean) |
| 71 | flag_dr | 医生医嘱标志 | flag_dr | char(1) |  | 布尔类型 (UFBoolean) |
| 72 | flag_newborn | 婴儿标志 | flag_newborn | char(1) |  | 布尔类型 (UFBoolean) |
| 73 | newborn | 婴儿序号 | newborn | int |  | 整数 (Integer) |
| 74 | pk_cnet | 临床事件 | pk_cnet | varchar(20) |  | 字符串 (String) |
| 75 | flag_prt | 打印标志 | flag_prt | char(1) |  | 布尔类型 (UFBoolean) |
| 76 | flag_medi_disc | 出院带药标志 | flag_medi_disc | char(1) |  | 布尔类型 (UFBoolean) |
| 77 | sort_exec | 执行序号 | sort_exec | int |  | 整数 (Integer) |
| 78 | flag_exc | 排斥医嘱标志 | flag_exc | char(1) |  | 布尔类型 (UFBoolean) |
| 79 | pk_ord_exc | 排斥医嘱主键 | pk_ord_exc | varchar(20) |  | 字符串 (String) |
| 80 | flag_urgent | 加急标志 | flag_urgent | char(1) |  | 布尔类型 (UFBoolean) |
| 81 | flag_treat | 治疗标志 | flag_treat | char(1) |  | 布尔类型 (UFBoolean) |
| 82 | flag_prevent | 预防标志 | flag_prevent | char(1) |  | 布尔类型 (UFBoolean) |
| 83 | flag_indi | 适应症标志 | flag_indi | char(1) |  | 布尔类型 (UFBoolean) |
| 84 | note | 医嘱备注 | note | varchar(512) |  | 字符串 (String) |
| 85 | pk_ord_cp | 临床路径医嘱主键 | pk_ord_cp | varchar(50) |  | 字符串 (String) |
| 86 | price | 参考单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 87 | flag_prt_guide | 指引单打印标志 | flag_prt_guide | char(1) |  | 布尔类型 (UFBoolean) |
| 88 | sensitive | 试敏 | sensitive | varchar(10) |  | 字符串 (String) |
| 89 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 90 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 91 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 92 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |