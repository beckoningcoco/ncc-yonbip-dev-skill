# |<<

**医疗执行_医嘱_物品_请领明细 (uh_ex_ord_pd_dt / com.yonyou.yh.nhis.pd.ordpdapply.vo.OrdPDAppItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6102.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpddt | 物品执行明细主键 | pk_ordpddt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ordpd | 医疗执行 | pk_ordpd | varchar(20) |  | 医疗执行_医嘱_物品请领(退)单 (ordpdapply) |
| 5 | pk_pdtype | 物品类型主键 | pk_pdtype | varchar(20) |  | 物品类型(自定义档案) (Defdoc-080001) |
| 6 | dt_pdtype | 物品类型编码 | dt_pdtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_srvtype | 服务类型主键 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 8 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 9 | pk_ord | 医嘱 | pk_ord | char(20) |  | 字符串 (String) |
| 10 | name_ord | 医嘱名称 | name_ord | varchar(50) |  | 字符串 (String) |
| 11 | desc_ord | 医嘱内容 | desc_ord | varchar(4000) |  | 字符串 (String) |
| 12 | pk_usage | 医嘱用法主键 | pk_usage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 13 | dt_usage | 医嘱用法编码 | dt_usage | varchar(20) |  | 字符串 (String) |
| 14 | pk_usagenote | 用法要求主键 | pk_usagenote | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 15 | dt_usagenote | 用法要求编码 | dt_usagenote | varchar(50) |  | 字符串 (String) |
| 16 | pk_freq | 医嘱频次主键 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 17 | days_ord | 医嘱天数 | days_ord | int |  | 整数 (Integer) |
| 18 | pk_ordsrv | 医嘱服务 | pk_ordsrv | varchar(50) |  | 字符串 (String) |
| 19 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 20 | code_srv | 服务编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 21 | pk_measdoc_med | 医学单位 | pk_measdoc_med | varchar(20) |  | 计量单位 (measdoc) |
| 22 | quan_med | 数值_医学单位 | quan_med | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | pk_dispmode | 发药模式主键 | pk_dispmode | varchar(20) |  | 发药方式(自定义档案) (Defdoc-030410) |
| 24 | dt_dispmode | 发药模式编码 | dt_dispmode | varchar(50) |  | 字符串 (String) |
| 25 | eu_medicontr | 受控药品类型 | eu_medicontr | int |  | 整数 (Integer) |
| 26 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 27 | code_pd | 物品编码 | code_pd | varchar(300) |  | 字符串 (String) |
| 28 | pk_batch_pd | 物品批次主键 | pk_batch_pd | char(20) |  | 字符串 (String) |
| 29 | batch_pd | 物品批号 | batch_pd | varchar(30) |  | 字符串 (String) |
| 30 | pk_measdoc_cur | 物品包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 计量单位 (measdoc) |
| 31 | pk_measdoc_base | 物品包装单位_基本 | pk_measdoc_base | varchar(20) |  | 计量单位 (measdoc) |
| 32 | factor_cb | 换算系数_当前与基本 | factor_cb | varchar(50) |  | 字符串 (String) |
| 33 | price_sp | 售价_零售单位(主单位) | price_sp | decimal(14, 8) |  | 数值 (UFDouble) |
| 34 | purprice_sp | 进价_零售单位(主单位) | purprice_sp | decimal(14, 8) |  | 数值 (UFDouble) |
| 35 | ords | 医嘱付数 | ords | int |  | 整数 (Integer) |
| 36 | quan_cur_reqr | 医嘱数量_当前 | quan_cur_reqr | decimal(14, 2) |  | 数值 (UFDouble) |
| 37 | quan_base_reqr | 医嘱数量_基本 | quan_base_reqr | decimal(14, 2) |  | 数值 (UFDouble) |
| 38 | amount_reqr | 医嘱金额 | amount_reqr | decimal(14, 2) |  | 数值 (UFDouble) |
| 39 | ords_deli | 实发付数 | ords_deli | int |  | 整数 (Integer) |
| 40 | quan_cur_deli | 实发数量_当前 | quan_cur_deli | decimal(14, 2) |  | 数值 (UFDouble) |
| 41 | quan_base_deli | 实发数量_基本 | quan_base_deli | decimal(14, 2) |  | 数值 (UFDouble) |
| 42 | amount_deli | 实发金额 | amount_deli | decimal(14, 2) |  | 数值 (UFDouble) |
| 43 | ords_back | 实退付数 | ords_back | int |  | 整数 (Integer) |
| 44 | quan_cur_back | 实退数量_当前 | quan_cur_back | decimal(14, 2) |  | 数值 (UFDouble) |
| 45 | quan_base_back | 实退数量_基本 | quan_base_back | decimal(14, 2) |  | 数值 (UFDouble) |
| 46 | amount_back | 实退金额 | amount_back | decimal(14, 2) |  | 数值 (UFDouble) |
| 47 | ords_cg | 收费付数 | ords_cg | int |  | 整数 (Integer) |
| 48 | quan_cur_cg | 收费数量_当前 | quan_cur_cg | decimal(14, 2) |  | 数值 (UFDouble) |
| 49 | quan_base_cg | 收费数量_基本 | quan_base_cg | decimal(14, 2) |  | 数值 (UFDouble) |
| 50 | amount_cg | 收费金额 | amount_cg | decimal(14, 2) |  | 数值 (UFDouble) |
| 51 | ords_ret | 退费付数 | ords_ret | int |  | 整数 (Integer) |
| 52 | quan_cur_ret | 退费数量_当前 | quan_cur_ret | decimal(14, 2) |  | 数值 (UFDouble) |
| 53 | quan_base_ret | 退费数量_基本 | quan_base_ret | decimal(14, 2) |  | 数值 (UFDouble) |
| 54 | amount_ret | 退费金额 | amount_ret | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | eu_status | 状态 | eu_status | int |  | 医疗执行医嘱物品明细状态 (ordpdappdtstatus) |  | 0=申请; |