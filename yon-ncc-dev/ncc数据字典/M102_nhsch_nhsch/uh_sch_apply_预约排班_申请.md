# |<<

**预约排班_申请 (uh_sch_apply / com.yonyou.yh.nhis.sch.appt.vo.SchApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schap | 预约等待队列主键 | pk_schap | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_schcate | 排班分类 | pk_schcate | varchar(20) |  | 排班分类 (SchcateVO) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 6 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 7 | patisex | 患者性别 | patisex | varchar(20) |  | 性别(自定义档案) (Defdoc-000000) |
| 8 | birthdate | 出生日期 | birthdate | char(19) |  | 日期 (UFDate) |
| 9 | mobile | 患者手机号码 | mobile | varchar(50) |  | 字符串 (String) |
| 10 | applyno | 对应申请单 | applyno | varchar(50) |  | 字符串 (String) |
| 11 | priority | 优先级 | priority | int |  | 整数 (Integer) |
| 12 | date_appt_begin | 日期_预约_开始 | date_appt_begin | char(19) |  | 日期时间 (UFDateTime) |
| 13 | date_appt_end | 日期_预约_结束 | date_appt_end | char(19) |  | 日期时间 (UFDateTime) |
| 14 | pk_dateslot | 日期分组 | pk_dateslot | varchar(20) |  | 排班_日期分组 (dateslot) |
| 15 | pk_schsrv | 排班服务 | pk_schsrv | varchar(20) |  | 排班服务 (UhSchSrvVO) |
| 16 | pk_res | 排班资源 | pk_res | varchar(20) |  | 排班资源 (SchResVO) |
| 17 | pk_dept_phy | 就诊科室 | pk_dept_phy | varchar(20) |  | 组织_部门 (dept) |
| 18 | date_entry | 日期_登记 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 19 | pk_psn_entry | 登记人员 | pk_psn_entry | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | pk_schappt | 对应预约 | pk_schappt | varchar(20) |  | 预约 (SchApptVO) |
| 21 | flag_canc | 取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | date_canc | 取消日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 23 | pk_psn_canc | 取消人员 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | note_canc | 取消备注 | note_canc | varchar(256) |  | 字符串 (String) |
| 25 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 26 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 46 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 47 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 48 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 49 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |