# |<<

**患者联系人 (uh_pi_ct / com.yonyou.yh.nhis.pi.pati.vo.PatiContactVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6181.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patict | 患者联系人主键 | pk_patict | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | name_cont | 联系人姓名 | name_cont | varchar(50) |  | 字符串 (String) |
| 7 | teleno | 电话号码 | teleno | varchar(50) |  | 字符串 (String) |
| 8 | mobile | 移动电话 | mobile | varchar(50) |  | 字符串 (String) |
| 9 | addr | 地址 | addr | varchar(256) |  | 字符串 (String) |
| 10 | postcode | 邮政编码 | postcode | varchar(50) |  | 字符串 (String) |
| 11 | pk_cttype | 联系人关系 | pk_cttype | varchar(20) |  | 家庭关系(自定义档案) (Defdoc-070200) |
| 12 | dt_cttype | 联系人关系编码 | dt_cttype | varchar(50) |  | 字符串 (String) |
| 13 | flag_def | 默认联系人标志 | flag_def | char(1) |  | 布尔类型 (UFBoolean) |