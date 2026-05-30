# |<<

**页签关联组件 (pub_besidepagecomp / nc.vo.pub.beside.BesidePageCompVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4714.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_besidepagecomp | 页签关联组件主键 | pk_besidepagecomp | char(20) | √ | 主键 (UFID) |
| 2 | pk_besidecomp | 组件 | pk_besidecomp | varchar(20) | √ | 侧边栏组件 (besidecomp) |
| 3 | orderindex | 显示顺序 | orderindex | int |  | 整数 (Integer) |
| 4 | showtype | 显示类型 | showtype | int |  | 显示类型 (showtype) | 1 | 1=卡片列表; |