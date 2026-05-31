# |<<

**医疗执行_部门_医技辅预约通知 (uh_ex_dept_mspappt / com.yonyou.yh.nhis.ex.mt.vo.DeptMTAppMspApptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mspappt | 医技辅预约通知主键 | pk_mspappt | char(20) | √ | 主键 (UFID) |
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
| 16 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 17 | code_srv | 服务编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 18 | note_exam | 其它医技注意事项 | note_exam | varchar(256) |  | 字符串 (String) |
| 19 | date_plan | 计划日期 | date_plan | char(19) |  | 日期时间 (UFDateTime) |
| 20 | flag_appt | 预约标志 | flag_appt | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | pk_restype | 医技资源类型 | pk_restype | varchar(20) |  | 医技资源类型(自定义档案) (Defdoc-010600) |
| 22 | dt_restype | 医技资源类型编码 | dt_restype | varchar(50) |  | 字符串 (String) |
| 23 | pk_msp | 医技资源 | pk_msp | varchar(20) |  | 医技资源设备 (MedSrvPVO) |
| 24 | date_appt | 预约日期 | date_appt | char(19) |  | 日期 (UFDate) |
| 25 | ticketno | 预约排队号 | ticketno | varchar(50) |  | 字符串 (String) |
| 26 | time_appt | 预约时间 | time_appt | char(19) |  | 日期时间 (UFDateTime) |
| 27 | flag_notice | 通知标志 | flag_notice | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | date_notice | 通知日期 | date_notice | char(19) |  | 日期时间 (UFDateTime) |
| 29 | pk_psn_notice | 通知人员 | pk_psn_notice | varchar(20) |  | 人员基本信息 (psndoc) |
| 30 | name_psn_notice | 通知人员名称 | name_psn_notice | varchar(50) |  | 字符串 (String) |
| 31 | note | 备注 | note | varchar(4000) |  | 字符串 (String) |