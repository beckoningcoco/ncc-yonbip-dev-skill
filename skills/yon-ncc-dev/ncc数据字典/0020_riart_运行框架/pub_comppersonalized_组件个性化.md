# |<<

**组件个性化 (pub_comppersonalized / nc.vo.pub.besidecomppersonalized.CompPersonalizedVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4722.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comppersonalized | 组件个性化主键 | pk_comppersonalized | char(20) | √ | 主键 (UFID) |
| 2 | priority | 优先级 | priority | int |  | 整数 (Integer) |
| 3 | isenable | 启用 | isenable | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | islist | 显示列表 | islist | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | iscard | 显示卡片 | iscard | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | compalias | 组件别名 | compalias | varchar(50) |  | 字符串 (String) |
| 7 | pk_besidcomp | 注册组件主键 | pk_besidcomp | varchar(20) |  | 侧边栏组件 (besidecomp) |
| 8 | pk_besidepagecomp | 页签关联组件 | pk_besidepagecomp | varchar(20) |  | 页签关联组件 (besidepagecomp) |
| 9 | displayableruleresult | 可展现的规则数据 | displayableruleresult | text(0) |  | BLOB (BLOB) |
| 10 | rule_script | 规则定义 | rule_script | text(0) |  | BLOB (BLOB) |