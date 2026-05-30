# |<<

**医疗物品包装 (bd_uh_pd_pu / com.yonyou.yh.nhis.bd.uhpd.vo.UHPdPuVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1073.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpu | 医疗物品包装主键 | pk_pdpu | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pd | 医疗物品 | pk_pd | varchar(50) |  | 字符串 (String) |
| 5 | pt_pdputype | 包装单位类型 | pt_pdputype | varchar(20) | √ | 包装单位类型(自定义档案) (Defdoc-080002) |
| 6 | dt_pdputype | 包装单位类型编码 | dt_pdputype | varchar(50) |  | 字符串 (String) |
| 7 | name_pdpu | 包装单位名称 | name_pdpu | varchar(50) | √ | 字符串 (String) |
| 8 | factor_bp | 换算系数_基本与包装 | factor_bp | decimal(14, 2) |  | 数值 (UFDouble) |