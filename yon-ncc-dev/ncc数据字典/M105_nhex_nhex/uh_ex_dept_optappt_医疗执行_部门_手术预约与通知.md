# |<<

**医疗执行_部门_手术预约与通知 (uh_ex_dept_optappt / com.yonyou.yh.nhis.ex.mt.vo.DeptMTAppOptApptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6071.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_optappt | 医疗执行手术预约与通知主键 | pk_optappt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_deptmt | 医疗执行部门医技 | pk_deptmt | varchar(20) |  | 医疗执行_部门_医技 (deptmtapply) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 6 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 7 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 9 | code_apply | 申请单编号 | code_apply | varchar(50) |  | 字符串 (String) |
| 10 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 11 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 12 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 13 | name_ord | 医嘱名称 | name_ord | varchar(50) |  | 字符串 (String) |
| 14 | desc_ord | 医嘱内容 | desc_ord | varchar(256) |  | 字符串 (String) |
| 15 | pk_ordsrv | 医嘱服务 | pk_ordsrv | varchar(50) |  | 字符串 (String) |
| 16 | pk_srv | 主要手术项目 | pk_srv | varchar(50) |  | 字符串 (String) |
| 17 | note_exam | 手术注意事项 | note_exam | varchar(256) |  | 字符串 (String) |
| 18 | date_plan | 手术计划日期 | date_plan | char(19) |  | 日期时间 (UFDateTime) |
| 19 | flag_appt | 手术预约成功标志 | flag_appt | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | pk_opttype | 手术台类型 | pk_opttype | varchar(20) |  | 手术台类型(自定义档案) (Defdoc-010500) |
| 21 | dt_opttype | 手术台类型编码 | dt_opttype | varchar(50) |  | 字符串 (String) |
| 22 | pk_opt | 手术台 | pk_opt | varchar(20) |  | 手术台 (opttbl) |
| 23 | date_appt | 手术日期 | date_appt | char(19) |  | 日期时间 (UFDateTime) |
| 24 | ticketno | 手术排队台号 | ticketno | varchar(50) |  | 字符串 (String) |
| 25 | time_appt | 手术开始时间 | time_appt | char(19) |  | 日期时间 (UFDateTime) |
| 26 | flag_notice | 通知标志 | flag_notice | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | date_notice | 通知日期 | date_notice | char(19) |  | 日期时间 (UFDateTime) |
| 28 | pk_psn_notice | 通知人员 | pk_psn_notice | varchar(20) |  | 人员基本信息 (psndoc) |
| 29 | name_psn_notice | 通知人员名称 | name_psn_notice | varchar(50) |  | 字符串 (String) |
| 30 | note | 备注 | note | varchar(4000) |  | 字符串 (String) |
| 31 | code_psn_opt | 主刀医生编码 | code_psn_opt | varchar(50) |  | 字符串 (String) |
| 32 | name_psn_opt | 主刀医生 | name_psn_opt | varchar(50) |  | 字符串 (String) |
| 33 | dt_psn_anes | 麻醉医生编码 | dt_psn_anes | varchar(50) |  | 字符串 (String) |
| 34 | name_psn_anes | 麻醉医生 | name_psn_anes | varchar(50) |  | 字符串 (String) |
| 35 | dt_psn_perf | 灌注医生编码 | dt_psn_perf | varchar(50) |  | 字符串 (String) |
| 36 | name_psn_perf | 灌注医生 | name_psn_perf | varchar(50) |  | 字符串 (String) |
| 37 | dt_psn_transf | 输血医生编码 | dt_psn_transf | varchar(50) |  | 字符串 (String) |
| 38 | name_psn_transf | 输血医生 | name_psn_transf | varchar(50) |  | 字符串 (String) |
| 39 | dt_psn_instru | 器械护士编码 | dt_psn_instru | varchar(50) |  | 字符串 (String) |
| 40 | name_psn_instru | 器械护士 | name_psn_instru | varchar(50) |  | 字符串 (String) |
| 41 | dt_psn_circuit | 巡回护士编码 | dt_psn_circuit | varchar(50) |  | 字符串 (String) |
| 42 | name_psn_circuit | 巡回护士 | name_psn_circuit | varchar(50) |  | 字符串 (String) |
| 43 | dt_psn_firstasis | 手术一助编码 | dt_psn_firstasis | varchar(50) |  | 字符串 (String) |
| 44 | name_psn_firstasis | 手术一助 | name_psn_firstasis | varchar(50) |  | 字符串 (String) |
| 45 | dt_psn_secasis | 手术二助编码 | dt_psn_secasis | varchar(50) |  | 字符串 (String) |
| 46 | name_psn_secasis | 手术二助 | name_psn_secasis | varchar(50) |  | 字符串 (String) |
| 47 | name_opt | 手术室 | name_opt | varchar(200) |  | 字符串 (String) |