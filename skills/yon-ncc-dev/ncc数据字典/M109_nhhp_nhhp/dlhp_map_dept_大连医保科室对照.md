# |<<

**大连医保科室对照 (dlhp_map_dept / com.yonyou.yh.nhis.hp.dalian.vo.DlhpMapDeptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1702.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mapdept | 主键 | pk_mapdept | char(20) | √ | 主键 (UFID) |
| 2 | pk_hpdept | 医保科室主键 | pk_hpdept | char(20) |  | 主键 (UFID) |
| 3 | hpcode | 细分科室代码(最主要) | hpcode | varchar(50) |  | 字符串 (String) |
| 4 | hpname | 细分科室名称 | hpname | varchar(50) |  | 字符串 (String) |
| 5 | code | his科室编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | pk_dept | his科室主键 | pk_dept | char(20) |  | 主键 (UFID) |
| 7 | name | his科室名称 | name | varchar(50) |  | 字符串 (String) |