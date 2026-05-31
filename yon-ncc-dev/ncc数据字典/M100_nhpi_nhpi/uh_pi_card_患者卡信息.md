# |<<

**患者卡信息 (uh_pi_card / com.yonyou.yh.nhis.pi.pati.vo.PatiCardVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6178.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paticard | 患者卡主键 | pk_paticard | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_cardtype | 卡类型 | pk_cardtype | varchar(20) |  | 就诊卡类型 (pvcardtype) |
| 7 | code_card | 卡编码 | code_card | varchar(50) |  | 字符串 (String) |
| 8 | flag_def | 默认标识 | flag_def | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | date_begin | 有效开始日期 | date_begin | char(10) |  | 模糊日期 (UFLiteralDate) |
| 10 | date_end | 有效结束日期 | date_end | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |