# |<<

**职业暴露登记 (uh_oc_expose_report / com.yonyou.yh.nhis.cn.hims.vo.OcExposeReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oc_expose_report | 主键 | pk_oc_expose_report | char(20) | √ | 主键 (UFID) |
| 2 | pk_psn_expose | 暴露者人员 | pk_psn_expose | char(20) |  | 主键 (UFID) |
| 3 | name_psn_expose | 暴露者姓名 | name_psn_expose | varchar(50) |  | 字符串 (String) |
| 4 | expose_addr | 暴露地点 | expose_addr | varchar(50) |  | 字符串 (String) |
| 5 | pk_dept_expose | 暴露科室主键 | pk_dept_expose | char(20) |  | 主键 (UFID) |
| 6 | name_dept_expose | 暴露科室 | name_dept_expose | varchar(50) |  | 字符串 (String) |
| 7 | date_expose | 暴露时间 | date_expose | char(50) |  | 字符串 (String) |
| 8 | pk_education | 学历主键 | pk_education | char(20) |  | 主键 (UFID) |
| 9 | dt_education | 学历 | dt_education | varchar(50) |  | 字符串 (String) |
| 10 | pk_post | 岗位主键 | pk_post | char(20) |  | 主键 (UFID) |
| 11 | dt_post | 岗位名称 | dt_post | varchar(50) |  | 字符串 (String) |
| 12 | pk_title | 职称主键 | pk_title | char(20) |  | 主键 (UFID) |
| 13 | dt_title | 职称 | dt_title | varchar(50) |  | 字符串 (String) |
| 14 | pk_working_years | 工龄主键 | pk_working_years | char(20) |  | 主键 (UFID) |
| 15 | dt_working_years | 工龄 | dt_working_years | varchar(50) |  | 字符串 (String) |
| 16 | phone | 手机号 | phone | varchar(50) |  | 字符串 (String) |
| 17 | idno | 身份证号 | idno | varchar(50) |  | 字符串 (String) |
| 18 | flag_os | 职业安全培训 | flag_os | char(50) |  | 字符串 (String) |
| 19 | flag_oe | 既往发生职业暴露 | flag_oe | char(50) |  | 字符串 (String) |
| 20 | pk_medical_activities | 暴露时从事医疗活动主键 | pk_medical_activities | char(20) |  | 主键 (UFID) |
| 21 | dt_medical_activities | 暴露时从事医疗活动 | dt_medical_activities | varchar(50) |  | 字符串 (String) |
| 22 | flag_hb | 既往接种乙肝疫苗 | flag_hb | char(50) |  | 字符串 (String) |
| 23 | hb_times | 接种乙肝疫苗次数 | hb_times | varchar(50) |  | 字符串 (String) |
| 24 | flag_hb_allergy | 接种乙肝有无过敏 | flag_hb_allergy | char(50) |  | 字符串 (String) |
| 25 | flag_hb_ip | 既往接种乙肝免疫蛋白注射 | flag_hb_ip | char(50) |  | 字符串 (String) |
| 26 | hb_ip_times | 既往接种乙肝免疫蛋白注射次数 | hb_ip_times | varchar(50) |  | 字符串 (String) |
| 27 | flag_hb_ip_allergy | 既往接种乙肝免疫蛋白注射有无过敏 | flag_hb_ip_allergy | char(50) |  | 字符串 (String) |
| 28 | hb_ip_reason | 既往接种乙肝免疫蛋白注射原因 | hb_ip_reason | varchar(50) |  | 字符串 (String) |
| 29 | dete_hb_ip | 既往接种乙肝免疫蛋白注射时间 | dete_hb_ip | varchar(50) |  | 字符串 (String) |
| 30 | pk_hb_surface_antibody | 乙肝表面抗体主键 | pk_hb_surface_antibody | char(20) |  | 主键 (UFID) |
| 31 | dt_hb_surface_antibody | 乙肝表面抗体 | dt_hb_surface_antibody | varchar(50) |  | 字符串 (String) |
| 32 | pk_infect_hiv | 既往感染史hiv主键 | pk_infect_hiv | char(20) |  | 主键 (UFID) |
| 33 | dt_infect_hiv | 既往感染史hiv | dt_infect_hiv | varchar(50) |  | 字符串 (String) |
| 34 | pk_infect_hcv | 既往感染史hcv主键 | pk_infect_hcv | char(20) |  | 主键 (UFID) |
| 35 | dt_infect_hcv | 既往感染史hcv | dt_infect_hcv | varchar(50) |  | 字符串 (String) |
| 36 | pk_infect_hbv | 既往感染史hbv主键 | pk_infect_hbv | char(20) |  | 主键 (UFID) |
| 37 | name_infect_hbv | 既往感染史hbv | name_infect_hbv | varchar(50) |  | 字符串 (String) |
| 38 | pk_infect_tp | 既往感染史tp主键 | pk_infect_tp | char(20) |  | 主键 (UFID) |
| 39 | dt_infect_tp | 既往感染史tp | dt_infect_tp | varchar(50) |  | 字符串 (String) |
| 40 | register_number | 登记号 | register_number | varchar(50) |  | 字符串 (String) |
| 41 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 42 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 43 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 44 | rpt_status | 状态 | rpt_status | varchar(50) |  | 字符串 (String) |
| 45 | expose_type | 暴露方式 | expose_type | varchar(50) |  | 字符串 (String) |
| 46 | age | 年龄 | age | varchar(50) |  | 字符串 (String) |
| 47 | sex | 性别 | sex | varchar(50) |  | 字符串 (String) |
| 48 | clark_id | 工号 | clark_id | varchar(50) |  | 字符串 (String) |
| 49 | psn_dept_name | 暴露者科室 | psn_dept_name | varchar(50) |  | 字符串 (String) |
| 50 | pk_psn_dept | 暴露者科室pk | pk_psn_dept | varchar(50) |  | 字符串 (String) |
| 51 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 52 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 53 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 54 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 55 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 56 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 57 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 58 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 59 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |