# |<<

**医保人员信息 (dlhp_psn / com.yonyou.yh.nhis.hp.dalian.vo.DlHpPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1704.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hppsn | 医保人员主键 | pk_hppsn | char(20) | √ | 主键 (UFID) |
| 2 | sorno | 序号 | sorno | varchar(50) |  | 字符串 (String) |
| 3 | edit | 编辑 | edit | varchar(50) |  | 字符串 (String) |
| 4 | eu_sh | 审核状态 | eu_sh | varchar(50) |  | 字符串 (String) |
| 5 | eu_fh | 复核状态 | eu_fh | varchar(50) |  | 字符串 (String) |
| 6 | num_mz | 定点编号 | num_mz | varchar(50) |  | 字符串 (String) |
| 7 | mun_zmz | 子门诊号 | mun_zmz | varchar(50) |  | 字符串 (String) |
| 8 | date_fp | 审批日期 | date_fp | varchar(50) |  | 字符串 (String) |
| 9 | hpcode | 医师编码（主要） | hpcode | varchar(50) |  | 字符串 (String) |
| 10 | hpname | 姓名 | hpname | varchar(50) |  | 字符串 (String) |
| 11 | hpsex | 性别 | hpsex | varchar(50) |  | 字符串 (String) |
| 12 | num_id | 身份证或护照号码 | num_id | varchar(50) |  | 字符串 (String) |
| 13 | eu_doc | 医师状态 | eu_doc | varchar(50) |  | 字符串 (String) |
| 14 | type_zyzb | 执业资格类别 | type_zyzb | varchar(50) |  | 字符串 (String) |
| 15 | type_zy | 执业类别 | type_zy | varchar(50) |  | 字符串 (String) |
| 16 | area_zy | 执业范围 | area_zy | varchar(50) |  | 字符串 (String) |
| 17 | time_zg | 取得执业资格时间 | time_zg | varchar(50) |  | 字符串 (String) |
| 18 | num_zy | 执业医师资格证书号 | num_zy | varchar(50) |  | 字符串 (String) |
| 19 | add1 | 执业地点（一） | add1 | varchar(50) |  | 字符串 (String) |
| 20 | add2 | 执业地点（二） | add2 | varchar(50) |  | 字符串 (String) |
| 21 | add3 | 执业地点（三） | add3 | varchar(50) |  | 字符串 (String) |
| 22 | add4 | 执业地点（四） | add4 | varchar(50) |  | 字符串 (String) |
| 23 | add5 | 执业地点（五） | add5 | varchar(50) |  | 字符串 (String) |
| 24 | per_zy | 专业技术职务资格 | per_zy | varchar(50) |  | 字符串 (String) |
| 25 | time_zcqd | 职称取得时间 | time_zcqd | varchar(50) |  | 字符串 (String) |
| 26 | job | 职务 | job | varchar(50) |  | 字符串 (String) |
| 27 | phone | 联系电话 | phone | varchar(50) |  | 字符串 (String) |
| 28 | dept1 | 所在科室 | dept1 | varchar(50) |  | 字符串 (String) |
| 29 | date_sq | 申请日期 | date_sq | varchar(50) |  | 字符串 (String) |
| 30 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 31 | pk_org | 机构 | pk_org | char(20) |  | 主键 (UFID) |