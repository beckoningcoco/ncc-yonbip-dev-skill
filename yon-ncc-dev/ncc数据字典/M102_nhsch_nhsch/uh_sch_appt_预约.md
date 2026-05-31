# |<<

**预约 (uh_sch_appt / com.yonyou.yh.nhis.sch.appt.vo.SchApptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6257.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schappt | 排班预约主键 | pk_schappt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_schcate | 排班分类 | pk_schcate | varchar(20) |  | 排班分类 (SchcateVO) |
| 5 | pk_sch | 排班 | pk_sch | varchar(20) |  | 排班预约_排班 (SchVO) |
| 6 | code | 预约编码 | code | varchar(30) |  | 字符串 (String) |
| 7 | name | 预约名称 | name | varchar(50) |  | 字符串 (String) |
| 8 | date_appt | 就诊治疗日期 | date_appt | char(19) |  | 日期 (UFDate) |
| 9 | pk_dateslot | 日期分组 | pk_dateslot | varchar(20) |  | 排班_日期分组 (dateslot) |
| 10 | pk_res | 排班资源 | pk_res | varchar(20) |  | 排班资源 (SchResVO) |
| 11 | pk_schsrv | 排班服务 | pk_schsrv | varchar(50) |  | 字符串 (String) |
| 12 | ticketno | 票号 | ticketno | int |  | 整数 (Integer) |
| 13 | time_begin | 预计开始时间 | time_begin | char(8) |  | 时间 (UFTime) |
| 14 | time_end | 预计结束时间 | time_end | char(8) |  | 时间 (UFTime) |
| 15 | pk_pati_glo | 患者_全局 | pk_pati_glo | varchar(50) |  | 字符串 (String) |
| 16 | pk_pati_org | 患者_本机构 | pk_pati_org | varchar(20) |  | 患者基本信息 (pati) |
| 17 | pk_appttype | 预约渠道 | pk_appttype | varchar(20) |  | 预约渠道维护 (AppttypeVO) |
| 18 | date_entry | 操作日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 19 | pk_org_entry | 预约操作机构 | pk_org_entry | varchar(20) |  | 组织 (org) |
| 20 | pk_dept_entry | 预约操作部门 | pk_dept_entry | varchar(20) |  | 组织_部门 (dept) |
| 21 | pk_psn_entry | 预约操作人员 | pk_psn_entry | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | eu_status | 状态 | eu_status | int |  | 预约状态 (appt_enum) |  | 1=到达; |