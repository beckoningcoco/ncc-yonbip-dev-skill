# |<<

**共享中心_绩效数据提取配置 (sscpfm_datatransform_conf / nc.vo.sscpfm.basic.PFMDateTransformConfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5572.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar(50) | √ | 字符串 (String) |
| 2 | property | 属性 | property | varchar(50) |  | 字符串 (String) |
| 3 | value | 值 | value | varchar(254) |  | 字符串 (String) |
| 4 | isdoing | 正在提取 | isdoing | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | beforetime | 向前偏移分钟 | beforetime | int |  | 整数 (Integer) | 10 | [0 , 60] |