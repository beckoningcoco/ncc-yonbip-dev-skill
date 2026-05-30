# |<<

**医嘱处置医嘱开立服务UI (nhcn_opdoc / com.yonyou.yh.nhis.cn.ord.vo.OpDocSrvOrderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3823.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opdoc | 医嘱处置主键 | pk_opdoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 3 | pk_srvtype | 服务类型 | pk_srvtype | varchar(50) |  | 字符串 (String) |
| 4 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_anti | 抗生素分类 | pk_anti | varchar(50) |  | 字符串 (String) |
| 6 | dt_anti | 抗生素分类编码 | dt_anti | varchar(50) |  | 字符串 (String) |
| 7 | pk_pois | 毒麻分类 | pk_pois | varchar(50) |  | 毒麻分类 (PoHempClasEnum) |  | 0=一般药品; |