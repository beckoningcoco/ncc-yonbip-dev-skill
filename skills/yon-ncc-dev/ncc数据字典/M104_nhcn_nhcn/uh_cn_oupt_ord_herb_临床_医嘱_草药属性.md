# |<<

**临床_医嘱_草药属性 (uh_cn_oupt_ord_herb / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrdHerbVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordherb | 草药属性主键 | pk_ordherb | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_ord | 医嘱主键 | pk_ord | char(20) |  | 主键 (UFID) |
| 5 | pk_srv | 医嘱服务 | pk_srv | char(20) |  | 主键 (UFID) |
| 6 | pk_pd | 对应物品 | pk_pd | char(20) |  | 主键 (UFID) |
| 7 | pk_measdoc | 单位 | pk_measdoc | char(20) |  | 主键 (UFID) |
| 8 | quan | 单次用量 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | usagenote | 服法说明 | usagenote | varchar(256) |  | 字符串 (String) |
| 10 | price | 参考单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_tisane | 草药煎法 | pk_tisane | varchar(20) |  | 字符串 (String) |