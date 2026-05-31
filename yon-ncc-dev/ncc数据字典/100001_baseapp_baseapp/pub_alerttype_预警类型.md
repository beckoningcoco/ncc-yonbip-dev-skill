# |<<

**预警类型 (pub_alerttype / nc.vo.pub.pa.AlerttypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4699.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alerttype | 主键 | pk_alerttype | char(20) | √ | 主键 (UFID) |
| 2 | belong_system | 所属模块 | belong_system | varchar(20) |  | 字符串 (String) |
| 3 | bizconfigclass | bizconfigclass | bizconfigclass | varchar(128) |  | 字符串 (String) |
| 4 | busi_plugin | 业务插件类名 | busi_plugin | varchar(128) |  | 字符串 (String) |
| 5 | descrip_resid | 描述资源id | descrip_resid | varchar(40) |  | 字符串 (String) |
| 6 | description | 描述 | description | varchar(128) |  | 字符串 (String) |
| 7 | name_resid | 名称资源id | name_resid | varchar(40) |  | 字符串 (String) |
| 8 | tasktype | 任务类型 | tasktype | varchar(50) |  | 字符串 (String) |
| 9 | type_name | 名称 | type_name | varchar(50) |  | 字符串 (String) |
| 10 | pk_busiobj | 业务对象 | pk_busiobj | varchar(20) |  | 字符串 (String) |
| 11 | exeintervalunit | 最小间隔方式 | exeintervalunit | int |  | 整数 (Integer) |
| 12 | executeinterval | 最小间隔 | executeinterval | int |  | 整数 (Integer) |