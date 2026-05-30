# |<<

**临床_医嘱_草药属性 (uh_cn_ord_herb / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdHerbVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordherb | 草药属性主键 | pk_ordherb | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 字符串 (String) |
| 4 | pk_ord | 医嘱主键 | pk_ord | char(20) |  | 字符串 (String) |
| 5 | pk_srv | 医嘱服务 | pk_srv | char(20) |  | 字符串 (String) |
| 6 | pk_pd | 对应物品 | pk_pd | char(20) |  | 字符串 (String) |
| 7 | pk_measdoc | 单位 | pk_measdoc | char(20) |  | 字符串 (String) |
| 8 | quan | 单次用量 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | usagenote | 服法说明 | usagenote | varchar(256) |  | 字符串 (String) |
| 10 | price | 参考单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 12 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 13 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 14 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 15 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 16 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 17 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 18 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 19 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 20 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |