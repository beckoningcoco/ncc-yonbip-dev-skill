# |<<

**三级检查医生设置 (uh_cn_emr_doctor / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrDoctorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5997.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnemrdotcor | 三级检查设置主键 | pk_cnemrdotcor | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(50) |  | 字符串 (String) |
| 5 | pk_pi | 患者信息 | pk_pi | varchar(50) |  | 字符串 (String) |
| 6 | pk_doct_upper | 上级医师主键 | pk_doct_upper | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | name_doct_upper | 上级医师姓名 | name_doct_upper | varchar(50) |  | 字符串 (String) |
| 8 | pk_doct_supper | 主任医师主键 | pk_doct_supper | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | name_doct_supper | 主任医师姓名 | name_doct_supper | varchar(50) |  | 字符串 (String) |
| 10 | pk_psn_phy | 主治医师主键 | pk_psn_phy | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | name_psn_phy | 主治医师姓名 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 12 | pk_psn_qa | 科室质控医师主键 | pk_psn_qa | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | name_psn_qa | 科室质控医师姓名 | name_psn_qa | varchar(50) |  | 字符串 (String) |
| 14 | pk_psn_ns | 责任护士主键 | pk_psn_ns | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | name_psn_ns | 责任护士姓名 | name_psn_ns | varchar(50) |  | 字符串 (String) |
| 16 | pk_ns_supper | 护士长主键 | pk_ns_supper | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | name_ns_supper | 护士长姓名 | name_ns_supper | varchar(50) |  | 字符串 (String) |
| 18 | pk_pvdept | 患者就诊科室主键 | pk_pvdept | varchar(50) |  | 字符串 (String) |
| 19 | pk_cnemrqa | 转科质控主键 | pk_cnemrqa | varchar(50) |  | 字符串 (String) |