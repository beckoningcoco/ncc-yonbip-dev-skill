# |<<

**医疗执行_医嘱_手术记录 (uh_ex_ord_optrec / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppOptRecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6097.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_optrec | 手术记录主键 | pk_optrec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_ordmt | 医疗执行医嘱医技 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技 (OrdMTApplyVO) |
| 5 | name_optype | 手术类型 | name_optype | varchar(100) |  | 字符串 (String) |
| 6 | dt_optype | 手术类型编码 | dt_optype | varchar(100) |  | 字符串 (String) |
| 7 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 8 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(100) |  | 字符串 (String) |
| 9 | pk_srv_opt | 主要手术 | pk_srv_opt | varchar(50) |  | 字符串 (String) |
| 10 | code_srv_opt | 主要手术名称 | code_srv_opt | varchar(256) |  | 字符串 (String) |
| 11 | name_oplevel | 手术级别 | name_oplevel | varchar(100) |  | 字符串 (String) |
| 12 | dt_oplevel | 手术级别编码 | dt_oplevel | varchar(100) |  | 字符串 (String) |
| 13 | optcn | 手术个数 | optcn | int |  | 整数 (Integer) |
| 14 | name_oppos | 手术体位 | name_oppos | varchar(100) |  | 字符串 (String) |
| 15 | name_anae | 麻醉方法 | name_anae | varchar(100) |  | 字符串 (String) |
| 16 | dt_anae | 麻醉方法编码 | dt_anae | varchar(100) |  | 字符串 (String) |
| 17 | name_posanae | 麻醉部位 | name_posanae | varchar(100) |  | 字符串 (String) |
| 18 | dt_posanae | 麻醉部位编码 | dt_posanae | varchar(100) |  | 字符串 (String) |
| 19 | date_opt_begin | 手术开始日期 | date_opt_begin | char(19) |  | 日期时间 (UFDateTime) |
| 20 | date_opt_end | 手术结束日期 | date_opt_end | char(19) |  | 日期时间 (UFDateTime) |
| 21 | pk_psn_opt | 手术主刀医生 | pk_psn_opt | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | name_psn_opt | 手术主刀医生名称 | name_psn_opt | varchar(300) |  | 字符串 (String) |
| 23 | name_incitype | 切口等级 | name_incitype | varchar(100) |  | 字符串 (String) |
| 24 | dt_incitype | 切口等级编码 | dt_incitype | varchar(100) |  | 字符串 (String) |
| 25 | name_heal | 切口愈合等级 | name_heal | varchar(100) |  | 字符串 (String) |
| 26 | dt_heal | 切口愈合等级编码 | dt_heal | varchar(100) |  | 字符串 (String) |
| 27 | name_asepsis | 无菌程度 | name_asepsis | varchar(100) |  | 字符串 (String) |
| 28 | dt_asepsis | 无菌程度编码 | dt_asepsis | varchar(100) |  | 字符串 (String) |
| 29 | amount_bl | 出血量 | amount_bl | decimal(14, 2) |  | 数值 (UFDouble) |
| 30 | amount_bt | 输血量 | amount_bt | decimal(14, 2) |  | 数值 (UFDouble) |
| 31 | flag_bt_react | 输血反应标志 | flag_bt_react | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | amount_iv | 输液量 | amount_iv | decimal(14, 2) |  | 数值 (UFDouble) |
| 33 | drug_before | 术前用药 | drug_before | varchar(256) |  | 字符串 (String) |
| 34 | drug_after | 术后用药 | drug_after | varchar(256) |  | 字符串 (String) |
| 35 | flag_drainage | 引流标志 | flag_drainage | char(1) |  | 布尔类型 (UFBoolean) |
| 36 | ma_drainage | 引流材料 | ma_drainage | varchar(256) |  | 字符串 (String) |
| 37 | num_drainage | 引流数目 | num_drainage | decimal(14, 2) |  | 数值 (UFDouble) |
| 38 | drainagepos | 放置部位 | drainagepos | varchar(256) |  | 字符串 (String) |
| 39 | flag_unexpected | 术中是否出现意外 | flag_unexpected | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | note_unexpected | 意外抢救过程描述 | note_unexpected | varchar(256) |  | 字符串 (String) |
| 41 | flag_isolate | 隔离状态 | flag_isolate | char(1) |  | 布尔类型 (UFBoolean) |
| 42 | pk_emr | 对应医疗记录 | pk_emr | varchar(20) |  | 临床_医疗记录 (unCNEmr) |
| 43 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 44 | code_apply | 申请单号 | code_apply | varchar(50) |  | 字符串 (String) |
| 45 | dt_psn_anes | 麻醉医生编码 | dt_psn_anes | varchar(50) |  | 字符串 (String) |
| 46 | name_psn_anes | 麻醉医生 | name_psn_anes | varchar(50) |  | 字符串 (String) |
| 47 | dt_psn_perf | 灌注医生编码 | dt_psn_perf | varchar(50) |  | 字符串 (String) |
| 48 | name_psn_perf | 灌注医生 | name_psn_perf | varchar(50) |  | 字符串 (String) |
| 49 | dt_psn_transf | 输血医生编码 | dt_psn_transf | varchar(50) |  | 字符串 (String) |
| 50 | name_psn_transf | 输血医生 | name_psn_transf | varchar(50) |  | 字符串 (String) |
| 51 | dt_psn_instru | 器械护士编码 | dt_psn_instru | varchar(50) |  | 字符串 (String) |
| 52 | name_psn_instru | 器械护士 | name_psn_instru | varchar(50) |  | 字符串 (String) |
| 53 | dt_psn_circuit | 巡回护士编码 | dt_psn_circuit | varchar(50) |  | 字符串 (String) |
| 54 | name_psn_circuit | 巡回护士 | name_psn_circuit | varchar(50) |  | 字符串 (String) |
| 55 | dt_psn_firstasis | 手术一助编码 | dt_psn_firstasis | varchar(50) |  | 字符串 (String) |
| 56 | name_psn_firstasis | 手术一助名称 | name_psn_firstasis | varchar(50) |  | 字符串 (String) |
| 57 | dt_psn_secasis | 手术二助编码 | dt_psn_secasis | varchar(50) |  | 字符串 (String) |
| 58 | name_psn_secasis | 手术二助名称 | name_psn_secasis | varchar(50) |  | 字符串 (String) |
| 59 | dt_psn_thdasis | 手术三助编码 | dt_psn_thdasis | varchar(50) |  | 字符串 (String) |
| 60 | name_psn_thdasis | 手术三助名称 | name_psn_thdasis | varchar(50) |  | 字符串 (String) |
| 61 | dt_psn_frthasis | 手术四助编码 | dt_psn_frthasis | varchar(50) |  | 字符串 (String) |
| 62 | name_psn_frthasis | 手术四助名称 | name_psn_frthasis | varchar(50) |  | 字符串 (String) |
| 63 | dt_psn_confirm | 报告确认人编码 | dt_psn_confirm | varchar(50) |  | 字符串 (String) |
| 64 | name_psn_confirm | 报告确认人 | name_psn_confirm | varchar(50) |  | 字符串 (String) |
| 65 | confirm_time | 报告时间 | confirm_time | char(19) |  | 日期时间 (UFDateTime) |
| 66 | dt_before_diag | 术前诊断编码 | dt_before_diag | varchar(255) |  | 字符串 (String) |
| 67 | name_before_diag | 术前诊断 | name_before_diag | varchar(255) |  | 字符串 (String) |
| 68 | dt_after_diag | 术后诊断编码 | dt_after_diag | varchar(255) |  | 字符串 (String) |
| 69 | name_after_diag | 术后诊断 | name_after_diag | varchar(255) |  | 字符串 (String) |
| 70 | date_opt_exec | 执行时间 | date_opt_exec | char(19) |  | 日期时间 (UFDateTime) |
| 71 | date_opt_operate | 操作时间 | date_opt_operate | char(19) |  | 日期时间 (UFDateTime) |