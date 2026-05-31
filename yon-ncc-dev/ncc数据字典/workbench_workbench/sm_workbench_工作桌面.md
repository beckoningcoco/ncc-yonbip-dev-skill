# |<<

**工作桌面 (sm_workbench / nc.vo.platform.workbench.WorkBenchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5370.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workbench | 主键 | pk_workbench | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | relateid | 关联ID | relateid | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团ID | pk_group | varchar(50) |  | 字符串 (String) |
| 5 | isdisplay | 是否展示默认桌面 | isdisplay | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isclear | 标记是否为清空桌面 | isclear | char(1) |  | 布尔类型 (UFBoolean) |