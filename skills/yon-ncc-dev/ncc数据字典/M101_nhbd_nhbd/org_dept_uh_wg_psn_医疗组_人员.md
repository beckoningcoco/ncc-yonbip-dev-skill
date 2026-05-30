# |<<

**医疗组_人员 (org_dept_uh_wg_psn / com.yonyou.yh.nhis.bd.uhworkgrp.vo.UhWorkGrpPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4048.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wgpsn | 医疗组人员主键 | pk_wgpsn | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_psn | 人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 5 | date_begin | 日期有效开始 | date_begin | char(19) |  | 日期(开始) (UFDateBegin) |
| 6 | date_end | 日期有效结束 | date_end | char(19) |  | 日期(结束) (UFDateEnd) |
| 7 | dt_role_pvpsn | 医疗组医生承担角色编码 | dt_role_pvpsn | varchar(50) |  | 字符串 (String) |
| 8 | pk_role_pvpsn | 医疗组医生承担角色 | pk_role_pvpsn | varchar(20) |  | 医护人员角色(自定义档案) (Defdoc-000111) |