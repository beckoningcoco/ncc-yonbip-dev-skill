# |<<

**串医嘱记录表 (uh_cn_pv_log / com.yonyou.yh.nhis.cn.CnpvlogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6053.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnlog | 主键 | pk_cnlog | char(20) | √ | 主键 (UFID) |
| 2 | pk_pv1 | pv主键1 | pk_pv1 | char(20) |  | 主键 (UFID) |
| 3 | pk_pv2 | pv主键2 | pk_pv2 | char(20) |  | 主键 (UFID) |
| 4 | ipaddress | ip地址 | ipaddress | varchar(50) |  | 字符串 (String) |
| 5 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |