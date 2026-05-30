# |<<

**患者基本信息 (uh_pi / com.yonyou.yh.nhis.pv.patibanner.vo.PatiBannerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pati | 患者主键 | pk_pati | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | paticode | 患者编码 | paticode | varchar(50) |  | 字符串 (String) |
| 5 | patiname | 患者姓名 | patiname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | patiphoto | 患者照片 | patiphoto | image |  | 图片类型 (IMAGE) |
| 7 | mnecode | 输入串 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | pk_idtype | 证件类型 | pk_idtype | varchar(20) |  | 证件类型(自定义档案) (Defdoc-000007) |
| 9 | idno | 证件号码 | idno | varchar(50) |  | 字符串 (String) |
| 10 | hcid | 国家健康卡号 | hcid | varchar(50) |  | 字符串 (String) |
| 11 | siid | 医疗保险号 | siid | varchar(50) |  | 字符串 (String) |
| 12 | mpi | 区域主索引 | mpi | varchar(50) |  | 字符串 (String) |
| 13 | flag_ehr | 健康档案建立标志 | flag_ehr | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_sex | 性别编码 | pk_sex | varchar(20) |  | 性别(自定义档案) (Defdoc-000000) |
| 15 | date_birth | 出生日期 | date_birth | char(10) |  | 模糊日期 (UFLiteralDate) |
| 16 | pk_paticate | 患者分类 | pk_paticate | varchar(20) |  | 患者分类 (paticate) |
| 17 | pk_mari | 婚姻编码 | pk_mari | varchar(20) |  | 婚姻状况HIS(自定义档案) (Defdoc-000006) |
| 18 | pk_occu | 职业编码 | pk_occu | varchar(20) |  | 职业HIS(自定义档案) (Defdoc-070101) |
| 19 | pk_edu | 学历编码 | pk_edu | varchar(20) |  | 学历(自定义档案) (Defdoc-010302) |
| 20 | pk_country | 国籍编码 | pk_country | varchar(20) |  | 国籍(自定义档案) (Defdoc-000009) |
| 21 | pk_nation | 民族编码 | pk_nation | varchar(20) |  | 民族HIS(自定义档案) (Defdoc-000003) |
| 22 | teleno | 电话号码 | teleno | varchar(50) |  | 字符串 (String) |
| 23 | mobileno | 移动电话 | mobileno | varchar(50) |  | 字符串 (String) |
| 24 | email | 邮箱 | email | varchar(50) |  | 字符串 (String) |
| 25 | pk_region | 区域编码 | pk_region | varchar(20) |  | 行政区划(自定义档案) (Defdoc-010102) |
| 26 | unit_work | 工作单位 | unit_work | varchar(256) |  | 字符串 (String) |
| 27 | pk_patilog | 患者登录信息 | pk_patilog | char(20) |  | 主键 (UFID) |
| 28 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |