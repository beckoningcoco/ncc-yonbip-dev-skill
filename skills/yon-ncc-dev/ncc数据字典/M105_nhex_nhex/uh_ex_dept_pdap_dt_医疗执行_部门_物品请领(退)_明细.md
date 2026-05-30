# |<<

**医疗执行_部门_物品请领(退)_明细 (uh_ex_dept_pdap_dt / com.yonyou.yh.nhis.ex.pd.vo.DeptPdAppDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6074.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpdapdt | 部门物品请领(退)明细主键 | pk_deptpdapdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_deptpdapdt | 部门物品请领(退)明细主键 | pk_deptpdapdt | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 5 | pk_deptpdap | 部门物品请领(退) | pk_deptpdap | varchar(50) |  | 字符串 (String) |
| 6 | eu_direct | 请退方向 | eu_direct | int |  | 整数 (Integer) |
| 7 | pk_pv | 就诊 | pk_pv | varchar(50) |  | 字符串 (String) |
| 8 | pk_pres | 处方 | pk_pres | varchar(50) |  | 字符串 (String) |
| 9 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 10 | dt_dispmode | 物品分发模式 | dt_dispmode | varchar(50) |  | 字符串 (String) |
| 11 | flag_base | 基数管理标志 | flag_base | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | flag_disc | 出院携带标志 | flag_disc | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | flag_pati | 患者自备标志 | flag_pati | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_pd | 物品 | pk_pd | varchar(50) |  | 字符串 (String) |
| 15 | pk_measdoc_cur | 物品包装单位_当前 | pk_measdoc_cur | varchar(50) |  | 字符串 (String) |
| 16 | pk_measdoc_base | 物品包装单位_基本 | pk_measdoc_base | varchar(50) |  | 字符串 (String) |
| 17 | factor_cb | 换算系数公式_当前单位/基本单位 | factor_cb | varchar(256) |  | 字符串 (String) |
| 18 | quan_cur | 请领(退)数量_当前 | quan_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | quan_base | 请领(退)数量_基本 | quan_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ords | 请领(退)数量_付数 | ords | int |  | 整数 (Integer) |
| 21 | price | 参考单价(主计量单位) | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | price_cost | 成本单价 | price_cost | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | amount | 请领(退)金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | flag_de | 发放标志 | flag_de | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | flag_fin | 发放完成标志 | flag_fin | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | flag_stop | 停发标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | desc_exdeptpdstop | 停发原因 | desc_exdeptpdstop | varchar(256) |  | 字符串 (String) |
| 28 | pk_psn_stop | 停发人员 | pk_psn_stop | varchar(50) |  | 字符串 (String) |
| 29 | name_psn_stop | 停放人员名称 | name_psn_stop | varchar(50) |  | 字符串 (String) |
| 30 | pk_cg | 记费主键 | pk_cg | varchar(50) |  | 字符串 (String) |
| 31 | batch | 物料批次 | batch | varchar(50) |  | 字符串 (String) |
| 32 | code_pd | 物品编码 | code_pd | varchar(50) |  | 字符串 (String) |
| 33 | code_pres | 领料单号 | code_pres | varchar(50) |  | 字符串 (String) |
| 34 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 35 | code_srv | 检查项目名称 | code_srv | varchar(50) |  | 字符串 (String) |
| 36 | date_canc | 医嘱执行取消日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 37 | date_control | 控制日期 | date_control | char(19) |  | 日期时间 (UFDateTime) |
| 38 | date_stop | 停止时间 | date_stop | char(19) |  | 日期时间 (UFDateTime) |
| 39 | days_ord | 医嘱天数 | days_ord | int |  | 整数 (Integer) |
| 40 | desc_ord | 医嘱内容 | desc_ord | varchar(4000) |  | 字符串 (String) |
| 41 | dt_exdeptpdstop | dt_exdeptpdstop | dt_exdeptpdstop | varchar(50) |  | 字符串 (String) |
| 42 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 43 | dt_usage | 医嘱用法 | dt_usage | varchar(50) |  | 字符串 (String) |
| 44 | dt_usagenote | 医嘱要求 | dt_usagenote | varchar(50) |  | 字符串 (String) |
| 45 | eu_medicontr | 受控药品类型 | eu_medicontr | int |  | 整数 (Integer) |
| 46 | eu_pdtype | 物品类型 | eu_pdtype | int |  | 整数 (Integer) |
| 47 | eu_recur | 医嘱重复类型 | eu_recur | int |  | 整数 (Integer) |
| 48 | flag_canc | 作废标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | flag_control | 控制标志 | flag_control | char(1) |  | 布尔类型 (UFBoolean) |
| 50 | name_ord | 医嘱名称 | name_ord | varchar(50) |  | 字符串 (String) |
| 51 | name_psn_canc | 作废医生名称 | name_psn_canc | varchar(256) |  | 字符串 (String) |
| 52 | name_psn_control | name_psn_control | name_psn_control | varchar(50) |  | 字符串 (String) |
| 53 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 54 | pk_cgsrv | 记费服务 | pk_cgsrv | varchar(50) |  | 字符串 (String) |
| 55 | pk_dispmode | 物品发放模式 | pk_dispmode | varchar(20) |  | 字符串 (String) |
| 56 | pk_exdeptpdstop | pk_exdeptpdstop | pk_exdeptpdstop | varchar(20) |  | 字符串 (String) |
| 57 | pk_freq | 频次主键 | pk_freq | varchar(20) |  | 字符串 (String) |
| 58 | pk_freq_srv | 频次服务主键 | pk_freq_srv | varchar(20) |  | 字符串 (String) |
| 59 | pk_measdoc_med | 单次用量单位 | pk_measdoc_med | varchar(20) |  | 字符串 (String) |
| 60 | pk_ordsrv | 医嘱服务主键 | pk_ordsrv | varchar(20) |  | 字符串 (String) |
| 61 | pk_pati | 患者 | pk_pati | varchar(20) |  | 字符串 (String) |
| 62 | pk_psn_canc | 作废医生 | pk_psn_canc | varchar(20) |  | 字符串 (String) |
| 63 | pk_psn_control | pk_psn_control | pk_psn_control | varchar(20) |  | 字符串 (String) |
| 64 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 字符串 (String) |
| 65 | pk_srv | 服务 | pk_srv | varchar(20) |  | 字符串 (String) |
| 66 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 字符串 (String) |
| 67 | pk_usage | 医嘱用法主键 | pk_usage | varchar(20) |  | 字符串 (String) |
| 68 | pk_usagenote | 用法要求 | pk_usagenote | varchar(20) |  | 字符串 (String) |
| 69 | price_sp | 售价 | price_sp | decimal(28, 8) |  | 数值 (UFDouble) |
| 70 | purprice_sp | 进价 | purprice_sp | decimal(28, 8) |  | 数值 (UFDouble) |
| 71 | quan_med | 药品用量 | quan_med | decimal(28, 8) |  | 数值 (UFDouble) |