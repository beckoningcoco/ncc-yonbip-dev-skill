# |<<

**大连医保人员对照 (dlhp_map_psn / com.yonyou.yh.nhis.hp.dalian.vo.DlhpMapPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1703.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mappsn | 主键 | pk_mappsn | char(20) | √ | 主键 (UFID) |
| 2 | pk_hppsn | 医保人员主键 | pk_hppsn | char(20) |  | 主键 (UFID) |
| 3 | hpcode | 医师编码（主要） | hpcode | varchar(50) |  | 字符串 (String) |
| 4 | hpname | 姓名 | hpname | varchar(50) |  | 字符串 (String) |
| 5 | pk_psndoc | his人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 6 | code | his人员编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | his人员姓名 | name | varchar(50) |  | 字符串 (String) |