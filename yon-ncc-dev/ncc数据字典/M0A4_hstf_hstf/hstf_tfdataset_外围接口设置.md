# |<<

**外围接口设置 (hstf_tfdataset / nc.vo.hstf.tfdataset.TfdatasetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2787.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tfdataset | 主键 | pk_tfdataset | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | systemcode | 外围系统 | systemcode | varchar(50) | √ | 字符串 (String) |
| 5 | tftype | 接口类型 | tftype | int | √ | 外围接口类型 (tftype) |  | 1=登录; |