# |<<

**危急值医嘱表 (uh_cn_ord_msg / com.yonyou.yh.nhis.cn.ord.v2.vo.CnOrdMsgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6025.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordmsg | 危急值医嘱主键 | pk_ordmsg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_msg | 危急值外键 | pk_msg | char(20) |  | 主键 (UFID) |
| 5 | pk_ord | 医嘱外键 | pk_ord | varchar(50) |  | 字符串 (String) |
| 6 | pvcode | 住院号 | pvcode | varchar(50) |  | 字符串 (String) |
| 7 | flag_isext | 是否H6标识 | flag_isext | varchar(50) |  | 字符串 (String) |